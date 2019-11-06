package org.wdzl.first.Java_300pra.OldTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        byte []buf =new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        DatagramSocket server = new DatagramSocket(9923);
        while(true)
        {
            server.receive(dp);
            System.out.println(new String(buf,0,dp.getLength()));
        }
    }
}
