package org.wdzl.first.HolidayFive;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Demo_4_send implements  Runnable{
    PipedOutputStream pos = new PipedOutputStream();

    @Override
    public void run() {
        String str = "你好，My_friend";
        try
        {
            pos.write(str.getBytes());
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(pos!=null) {
                try {
                    pos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
