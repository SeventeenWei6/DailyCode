package org.wdzl.first.HolidayEight;

import javax.print.attribute.standard.Severity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
       //创建一个服务器端的网络套接字
        ServerSocket server = new ServerSocket(9000);
        //等待客户端连接
        System.out.println("服务器启动了，等待连接。。。");
        Socket client = server.accept();//用accept()阻塞等待客户端请求，有客户端访问，就产生一个socket
        //字节转字符
        InputStream in = client.getInputStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("客户端说:"+s);

        br.close();
        isr.close();
        in.close();
        client.close();
        server.close();

    }
}
