package org.wdzl.first.HolidayNine;

import org.wdzl.first.HolidayEight.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class D3_MoreServer  implements Runnable {
    ServerSocket s;
    {
        try {
            s = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    Socket temp;
    @Override
    public void run() {
        while(true)
        {
            try {
                temp = s.accept();
                DataInputStream dis = new DataInputStream(temp.getInputStream());
                String t = dis.readUTF();
                System.out.println(t);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
