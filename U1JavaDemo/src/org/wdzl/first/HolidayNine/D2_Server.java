package org.wdzl.first.HolidayNine;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class D2_Server  {
    public static void main(String[] args) {
        ServerSocket server;
        try
        {
            server = new ServerSocket(9987);
            System.out.println("服务器端已启动");
            Socket s = server.accept();
            System.out.println("连接成功!");
            while(true)
            {
                DataInputStream dop = new DataInputStream(s.getInputStream());
                String str = dop.readUTF();
                System.out.println("客户说:"+str);

                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                Scanner in = new Scanner(System.in);
                System.out.print("服务器:");
                String str2 = in.nextLine();
                dos.writeUTF(str2);
                dos.flush();
            }

        }catch(IOException E)
        {
            E.printStackTrace();
        }
    }
}

