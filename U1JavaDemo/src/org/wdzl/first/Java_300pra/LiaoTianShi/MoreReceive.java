package org.wdzl.first.Java_300pra.LiaoTianShi;

import org.wdzl.first.Java_300pra.LiaoTianShi.CloseUtil;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class MoreReceive implements Runnable{
    private DataInputStream dis;
    private boolean isRunning = true;
    public MoreReceive(Socket client)
    {
        try {
            dis = new DataInputStream(client.getInputStream());

        } catch (IOException e) {
          //   e.printStackTrace();
          isRunning = false;
            CloseUtil.closeAll(dis);
        }
    }
    public String Receive()
    {String msg = "";
        try {
             msg = dis.readUTF();

        } catch (IOException e) {
            //e.printStackTrace();
            isRunning = false;
            CloseUtil.closeAll(dis);
        }
        return msg;
    }
    @Override
    public void run() {
        while (isRunning)
        {
            System.out.println(Receive());
        }
    }
}
