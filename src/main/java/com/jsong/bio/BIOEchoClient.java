package com.jsong.bio;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class BIOEchoClient {

    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost", 12345);
        Scanner scan = new Scanner(client.getInputStream());
        scan.useDelimiter("\n");
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        //通过Socket创建客户端，在接受到键盘输入后，将输入信息写入OutputStream流中，并等待客户端返回信息，
        // 接受到返回信息后，则接着往下执行，若不需输入，则释放连接
        while (flag){
            String inputData = InputUtil.getString("请输入要发送的内容：").trim();
            out.println(inputData);
            if (scan.hasNext()){
                String str = scan.next();
                System.out.println(str);
            }
            if ("byebye".equalsIgnoreCase(inputData)){
                flag = false;
            }
        }
        client.close();
    }
}
