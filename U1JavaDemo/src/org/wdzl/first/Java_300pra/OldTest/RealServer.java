package org.wdzl.first.Java_300pra.OldTest;

import org.wdzl.first.HolidayEight.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RealServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket server = new Socket();

        System.out.println("服务器已启动...正在等待连接");
        server = serverSocket.accept();
        System.out.println("连接成功");
        String msg;
            DataInputStream dis = new DataInputStream(server.getInputStream());
            DataOutputStream dos = new DataOutputStream(server.getOutputStream());
            while ((msg  = dis.readUTF())!=""){
                 //msg  = dis.readUTF();
                 System.out.println(msg);
                dos.writeUTF("服务器"+" say:"+msg);
                dos.flush();
                }
        }
}
