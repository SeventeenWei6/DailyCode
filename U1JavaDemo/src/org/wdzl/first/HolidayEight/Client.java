package org.wdzl.first.HolidayEight;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    //客户端
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.254.1",9988);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        Scanner input = new Scanner(System.in);
        System.out.println("客户端启动：");

        new Thread(new send(dos)).start();
        new Thread(new Recieve(dis)).start();

    }
}


