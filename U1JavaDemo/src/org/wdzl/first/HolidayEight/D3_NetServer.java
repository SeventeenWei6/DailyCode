package org.wdzl.first.HolidayEight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class D3_NetServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;// 创建一个serversocket在端口27015监听客户请求
        server = new ServerSocket(27016);
        System.out.println("监听端口27015");
        Socket socket = null;
//用accept()阻塞等待客户请求，有客户到来则产生一个socket对象，并继续执行
        socket = server.accept();
        System.out.println("客户连接");
        String line;
        // 由socket对象得到输入流，并构成相应的BufferedReader对象
        BufferedReader clientbr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//由socket对象得到输出流，并构造PrintWriter对象
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader serverbr = new BufferedReader(new InputStreamReader(System.in));
        // 由系统标准输入设备构造BufferedReader对象
        System.out.println("客户端：" + clientbr.readLine());// 在标准输出上打印从客户端读入的字符串
        System.out.println("从客户端接受的数据：");
        System.out.println("输入数据发送给客户端,bye则退出：");
        line = serverbr.readLine();// 从标准输入读入一段字符串
        while (!line.equals("bye")) {// 如果字符为bye，则停止
            pw.print(line);// 向客户端输出该字符串
            System.out.println("发送给客户端的数据");
            System.out.println("服务器：" + line);// 在系统标准输出上打印读入的字符串
            System.out.println("客户端：" + clientbr.readLine());// 从客户端读入字符串，打印到标准输出上
            System.out.println("从客户端接受的数据：");
            line = serverbr.readLine();// 继续从系统标准输入读入一字符串，继续循环
        }
        // 关闭相关流
        clientbr.close();
        pw.close();
        serverbr.close();
        socket.close();
        server.close();
        try {
            server = new ServerSocket(27016);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
