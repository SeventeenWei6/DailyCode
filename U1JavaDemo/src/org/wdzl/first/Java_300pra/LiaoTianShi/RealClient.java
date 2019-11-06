package org.wdzl.first.Java_300pra.LiaoTianShi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RealClient {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入用户名:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        Socket client = new Socket("222.24.34.203",8999);
        new Thread(new MoreSend(client,name)).start();
        new Thread(new MoreReceive(client)).start();


    }
}
