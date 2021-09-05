package com.jsong.bio;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BIOEchoServer {

    private static final ThreadPoolExecutor THREADPOOL = new ThreadPoolExecutor(2,4,
            5, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static void main(String[] args) throws Exception{

        ServerSocket socket = new ServerSocket(12345);
        System.out.println("服务端已经启动，监听端口为：" + 12345);
        boolean flag = true;
        // 1.通过ServerSocket创建监听，并创建线程池
        // 2.当ServerSocket通过accept方法接受到请求时，线程池将会分出一个线程来执行所要进行的操作
        // 3.(分出的线程会)等待客户端输入完成（即客户端安排做的事），客户端输入完成，
        // 则将会执行自己的处理并返回相应的结果（需要服务端来进行的运算，取数等一些操作，本例中是更改字符串）
        // 4.服务端处理完成，则将数据返回客户端，等待客户端的下次输入事件，循环3,4,直至客户端释放连接
        while (flag){
            Socket client = socket.accept();
            THREADPOOL.execute(new EchoClientHandler(client));
        }
        THREADPOOL.shutdown();
        socket.close();
    }

    private static class EchoClientHandler implements Runnable{

        private Socket client;
        private Scanner scanner;
        private PrintStream out;
        private boolean flag = true;

        public EchoClientHandler(Socket client){
            this.client = client;
            try {
                this.scanner = new Scanner(this.client.getInputStream());
                this.scanner.useDelimiter("\n");
                this.out = new PrintStream(this.client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (this.flag){
                if(this.scanner.hasNext()){
                    String var = this.scanner.next().trim();
                    System.out.println("收到客户端发来的"+var);
                    if("byebye".equals(var)){
                        this.out.print("888888");
                        this.flag = false;
                    } else {
                        out.println("【echo】" + var);
                    }
                }
            }
            try {
                this.scanner.close();
                this.out.close();
                this.client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
