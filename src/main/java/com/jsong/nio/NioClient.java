package com.jsong.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * @author changsong
 */
public class NioClient {


    public static void main(String[] args) throws Exception{
        //创建一个SocketChannel对象，配置成非阻塞模式
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        //创建一个选择器，并把SocketChannel交给selector对象
        Selector selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_CONNECT);

        //发起建立连接的请求，这里会立即返回，当连接建立完成后，SocketChannel就会被选取出来
        socketChannel.connect(new InetSocketAddress("localhost", 8888));

        //遍历，不段的从Selector中选取出已经就绪的Channel，在这个例子中，Selector只监控了一个SocketChannel
        while (true) {
            selector.select(1000);
            Set<SelectionKey> selectionKeySet = selector.selectedKeys();

            for (SelectionKey selectionKey : selectionKeySet) {
                if(!selectionKey.isValid()) {
                    continue;
                }
                //连接建立完成后的操作：直接发送请求数据
                if (selectionKey.isConnectable()) {
                    if(socketChannel.finishConnect()) {
                        socketChannel.register(selector, SelectionKey.OP_READ);
                        doWriteRequest(((SocketChannel) selectionKey.channel()));
                    }
                }
                //如果当前已经可以读数据了，说明服务端已经响应完了，读取数据
                if (selectionKey.isReadable()) {
                    doRead(selectionKey);
                }
            }
            //最后同样要清除所有的Key
            selectionKeySet.removeAll(selectionKeySet);
        }
    }

    //发送请求
    private static void doWriteRequest(SocketChannel socketChannel) throws Exception{
        System.err.println("start connect...");

        //创建ByteBuffer对象，会放入数据
        ByteBuffer byteBuffer = ByteBuffer.allocate(1000);
        byteBuffer.put("Hello Server from client".getBytes());
        byteBuffer.flip();
        //写数据
        socketChannel.write(byteBuffer);
        if(!byteBuffer.hasRemaining()) {
            System.err.println("Send request success...");
        }
    }

    //读取服务端的响应
    private static void doRead(SelectionKey selectionKey) throws Exception{
        SocketChannel socketChannel = ((SocketChannel) selectionKey.channel());
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int len = socketChannel.read(byteBuffer);
        System.out.println("Recv:" + new String(byteBuffer.array(), 0 ,len));
    }
}
