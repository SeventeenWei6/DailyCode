package org.wdzl.first.Java_300pra.LiaoTianShi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MorePeopleServer {
    private List<MyChannel> all = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        new MorePeopleServer().start();
    }
    public void start() throws IOException {
        ServerSocket server = new ServerSocket(8999);
        while (true)
        {
            Socket client = server.accept();
            MyChannel channel = new MyChannel(client);
            all.add(channel);
            new Thread(channel).start();
        }
    }
    private class MyChannel implements Runnable{
        private DataInputStream dis;
        private DataOutputStream dos;
        private boolean isRunning = true;
        private String name;
        public MyChannel(Socket client)
        {
            try {
                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());
                this.name = dis.readUTF();
                this.send("欢迎进入聊天室");
                sendothers(this.name+"进入了聊天室",true);

            } catch (IOException e) {
               CloseUtil.closeAll(dis,dos);
               isRunning =false;

            }
        }
        private String Receive()
        {
            String msg = "";
            try {
                msg = dis.readUTF();
            } catch (IOException e) {
                CloseUtil.closeAll(dis);
                isRunning =false;
                all.remove(this);
            }
            return  msg;
        }
        private void send(String msg)
        {
            if(null == msg || msg.equals("")){
                return;
            }
            try {
                dos.writeUTF(msg);
                dos.flush();

            } catch (IOException e) {
                CloseUtil.closeAll(dos);
                isRunning =false;
            }

        }
        /**/
        private void sendothers(String msg,boolean sys) {
            if (msg.startsWith("@") && msg.indexOf(":")!=-1) {
                String name = msg.substring(1, msg.indexOf(":"));
                String content = msg.substring(msg.indexOf(":") + 1);

                for (MyChannel other : all
                ) {
                    if (other.name.equals(name)) {
                        other.send(this.name + "对你说：" + content);
                    }
                }
            } else {
                for (MyChannel other : all
                ) {
                    if (other == this) {
                        continue;
                    }
                    if(sys == true) //sys==true 系统消息
                    {
                        other.send("系统消息:" + msg);
                    }
                    else{
                        other.send(this.name+"对所有人说:" + msg);
                    }
                }


            }
        }
        @Override
        public void run() {
            while (isRunning)
            {
                sendothers(Receive(),false);
            }
        }
    }
}
