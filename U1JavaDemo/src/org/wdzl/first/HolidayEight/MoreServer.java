package org.wdzl.first.HolidayEight;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MoreServer {
    public static void main(String[] args) throws IOException {
        ServerSocket s= new ServerSocket(9988);
        Socket temp =  s.accept();
        DataInputStream dis = new DataInputStream(temp.getInputStream());
       // DataOutputStream dos = new DataOutputStream(temp.getOutputStream());

        new Thread(new Recieve(dis)).start();
        //new Thread(new send(dos)).start();
    }
}
