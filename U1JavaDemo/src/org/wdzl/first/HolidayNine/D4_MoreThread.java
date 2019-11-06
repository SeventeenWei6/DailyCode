package org.wdzl.first.HolidayNine;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class D4_MoreThread implements Runnable {
    private Socket socket;

    public D4_MoreThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {


        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            ObjectInputStream ois = new ObjectInputStream(is);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

            D4_User user =  (D4_User) ois.readObject();
            System.out.println("客户端信息:"+user.getName()+": "+"登陆成功!");

            bw.write("恭喜"+user.getName()+"登录成功!");
            bw.flush();
            bw.close();
            ois.close();
            os.close();
            is.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
