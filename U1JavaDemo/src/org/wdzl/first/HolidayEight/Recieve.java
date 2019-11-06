package org.wdzl.first.HolidayEight;


import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Recieve implements Runnable {

    DataInputStream dis;

    public Recieve(DataInputStream dis) {
        this.dis = dis;
    }

    public void run() {
        while (true) {
            try{
                System.out.println("服务器：" + dis.readUTF());
            } catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}

