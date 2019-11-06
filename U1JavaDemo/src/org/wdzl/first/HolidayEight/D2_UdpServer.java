package org.wdzl.first.HolidayEight;

import java.io.IOException;
import java.net.*;

public class D2_UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(9000);
        System.out.println("服务器端启动，等待客户端...");
       while(true)
       {
           byte b[] = new byte[1024];
           DatagramPacket dp = new DatagramPacket(b,0,b.length);
           server.receive(dp);
           String s  = new String(b,0,b.length);
           System.out.println(s);
       }



    }

}
