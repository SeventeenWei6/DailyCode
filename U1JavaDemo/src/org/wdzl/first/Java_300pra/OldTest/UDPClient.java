package org.wdzl.first.Java_300pra.OldTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        String str= "hello";
        byte buf[] = str.getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("222.24.34.101",9923));
        DatagramSocket client = new DatagramSocket();
        client.send(dp);
    }
}
