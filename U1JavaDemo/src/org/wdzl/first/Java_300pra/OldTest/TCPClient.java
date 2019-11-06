package org.wdzl.first.Java_300pra.OldTest;
/*
* Socket编程客户端
* */
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("222.24.34.101", 9922);//建立连接完成,但需要服务器端accept接受连接
        //创建流 输入输出东西
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        String str = null;
        System.out.print("client say:");
        str = input.nextLine();
        while (str.equals("bye")) {

            dos.writeUTF(str);//通信的过程中 另外新的客户端连接不上
            dos.flush();
            str = dis.readUTF();
            System.out.println("Server say:"+str);
            System.out.print("client say:");
            str = input.nextLine();
        }
        dis.close();
        dos.close();
        client.close();
    }
}
