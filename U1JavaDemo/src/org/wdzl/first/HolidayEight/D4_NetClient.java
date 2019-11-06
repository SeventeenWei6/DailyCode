package org.wdzl.first.HolidayEight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class D4_NetClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.254.1", 27016);// 向服务器端的27015端口发送请求
            System.out.println("获取连接，输入字符串，输入bye退出");
//由系统标准输入设备构造BufferedReader对象
            BufferedReader localbr = new BufferedReader(new InputStreamReader(System.in));
//由socket对象得到输出流，并构建PrintWriter对象
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
//由socket对象得到输入流，并构建BufferedReader对象
            BufferedReader serverbr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            line = localbr.readLine();// 从系统标准输入读入一字符串
            while (!line.equals("bye")) {// 输入bye，停止
                pw.print(line);// 将从系统标准输入读入的字符串输出到server
                pw.flush();// 刷新，使server马上收到该字符串
                System.out.println("发送给服务器的数据：");
                System.out.println("客户端：" + line);// 在系统标准输出上打印读入的字符串
//从服务器读入的字符串，打印到标准输出的
                System.out.println("服务器端：" + serverbr.readLine());
                System.out.println("从服务器接受的数据：");
                line = localbr.readLine();// 从系统标准输入读入一字符串，继续循环
            }
            pw.print(line);
            pw.flush();

            localbr.close();
            pw.close();
            serverbr.close();
            socket.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
