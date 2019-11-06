package org.wdzl.first.Java_300pra.LiaoTianShi;
/*
* 发送数据线程
*
* */
import org.wdzl.first.Java_300pra.LiaoTianShi.CloseUtil;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MoreSend implements Runnable {
    private BufferedReader console;
    private DataOutputStream dos;
    private boolean isRunning = true;
    private String name;
    public MoreSend(){
        console = new BufferedReader(new InputStreamReader(System.in));

    }
    public MoreSend(Socket client,String name){
        this();
        try {
            dos = new DataOutputStream(client.getOutputStream());
            this.name = name;
            send(this.name);
        } catch (IOException e) {
            //e.printStackTrace();
            isRunning = false;
            CloseUtil.closeAll(dos,console);
        }
    }
    //接受数据
    private String getMsgFromConsole()
    {
        try {
            return console.readLine();
        } catch (IOException e) {
            //e.printStackTrace();
            isRunning = false;
            CloseUtil.closeAll(dos,console);
        }
        return "";
    }
    //发送数据
    public void send(String msg)
    {
        try {
            if(null!=msg && ""!=msg) {
                dos.writeUTF(msg);
                dos.flush();
            }
        } catch (IOException e) {
            //e.printStackTrace();
            isRunning = false;
            CloseUtil.closeAll(dos,console);
        }
    }
    @Override
    public void run() {
      while (isRunning)
      {
          send(getMsgFromConsole());
      }
    }
}
