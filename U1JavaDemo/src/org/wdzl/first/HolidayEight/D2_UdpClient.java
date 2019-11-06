package org.wdzl.first.HolidayEight;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class D2_UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket();
        System.out.println("客户端启动");
        Scanner input = new Scanner(System.in);
        while(true)
        {
            String b = input.nextLine();
            byte c[] =b.getBytes();
            DatagramPacket dp = new DatagramPacket(c,0,c.length,new InetSocketAddress("192.168.254.1",9000));
            client.send(dp);
        }


    }
}
