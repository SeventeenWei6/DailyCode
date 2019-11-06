package org.wdzl.first.Java_300pra.OldTest;
/*
* Socket编程 服务器端
*
* */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(9922);//建立监听
            Socket socket = ss.accept();//做为服务器端来说,需要接受客户端的请求
            //接受成功
            System.out.println("客户端连接成功!");
            //输出接受信息
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            Scanner input = new Scanner(System.in);
            String str = null;
            System.out.print("client say:");
            str = dis.readUTF();
            while(str!=null) {
                System.out.println(str);
                System.out.print("Server say:");
//                dos.writeUTF("hello " + socket.getInetAddress() + "Port " + socket.getPort());
                str = input.nextLine();
                dos.writeUTF(str);
                System.out.print("client say:");
                str = dis.readUTF();
            }
            dos.close();
            dis.close();
    }
}
