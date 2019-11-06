package org.wdzl.first.HolidayNine;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class D4_ServerUser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       ServerSocket socket = new ServerSocket(9985);
       while(true)
       {
           Socket socket1 = socket.accept();
           System.out.println("连接成功!");
           new Thread(new D4_MoreThread(socket1)).start();

       }


    }
}
