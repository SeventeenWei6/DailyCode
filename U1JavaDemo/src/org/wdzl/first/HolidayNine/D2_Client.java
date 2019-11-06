package org.wdzl.first.HolidayNine;

import org.wdzl.first.HolidayEight.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class D2_Client {
    public static void main(String[] args) throws IOException {
        Socket client;
            client = new Socket("192.168.254.1",9987);
            System.out.println("客户端已启动");
            while(true)
            {
                Scanner input = new Scanner(System.in);
                System.out.print("客户:");
                String s = input.nextLine();
                DataOutputStream dop = new DataOutputStream(client.getOutputStream());
                dop.writeUTF(s);
                dop.flush();

                DataInputStream dis = new DataInputStream(client.getInputStream());
                String  str= dis.readUTF();
                System.out.println("服务器说:"+str);

            }

    }
}
