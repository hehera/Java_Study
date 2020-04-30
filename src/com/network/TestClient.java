package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author HHR
 * @date 2020/4/29 19:17
 */

//1.从键盘输入词语
//2.发送给服务器
//3.接收服务器
//1，2，3多次进行，直到键盘输入bye停止连接
public class TestClient {
    public static void main(String[] args) throws IOException {
        //1.连接服务器
        Socket socket=new Socket("192.168.174.1",8989);

        Scanner input=new Scanner(System.in);

        PrintStream ps=new PrintStream(socket.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while(true){
            System.out.print("输入词语：");

            String word=input.next();
            //发送给服务器
            ps.println(word);

            if("bye".equals(word)){
                System.out.println("传输结束，连接终止");
                break;
            }
            String result=br.readLine();
            System.out.println("服务器返回反转后的结果："+result);
        }
        input.close();
        socket.close();

    }
}
