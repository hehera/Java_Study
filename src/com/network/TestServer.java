package com.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HHR
 * @date 2020/4/29 19:03
 */
/*
* 服务器端
* （1）接受客户端的连接
* （2）接受客户端词语
* （3）把词语 反转 并返回给客户端
* （2）（3）多次，直到客户端发送“bye”
*
* */
public class TestServer {
    public static void main(String[] args) throws IOException {
        //1.开启服务器
        ServerSocket server=new ServerSocket(8989);

        boolean flag=true;
        while(flag){
            Socket socket=server.accept();
            MessageThread m=new MessageThread(socket);
            //2接收一个客户端的连接
            m.start();

        }
        //关闭服务器
        server.close();

    }

}
class MessageThread extends Thread{

    private Socket socket;

    public MessageThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        //3.获取输入流和输出流
        InputStream in = null;
        try {
            in = socket.getInputStream();



        InputStreamReader isr=new InputStreamReader(in);//这里不涉及编码问题。仅仅为转换流的问题

        BufferedReader br =new BufferedReader(isr);

        OutputStream out =socket.getOutputStream();


        PrintStream ps=new PrintStream(out);
        //从客户端接收词语
        String word;
        while((word=br.readLine())!=null){
            if("bye".equals(word)){

                break;
            }
            //如果不是bye要反转，并且返回
            StringBuilder sb=new StringBuilder(word);
            sb.reverse();
            //返回给客户端
            ps.println(sb.toString());
        }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //断开连接

    }
}

