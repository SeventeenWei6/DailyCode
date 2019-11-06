package org.wdzl.first.HolidayFive;

import java.io.IOException;
import java.io.PipedInputStream;

public class Demo_4_Receive implements Runnable{
    PipedInputStream pis = new PipedInputStream();

    @Override
    public void run() {
        byte []b = new byte[1024];
        int len = 0;
        try{
            len = pis.read(b);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("这是管道输入流，接收字符:"+new String(b,0,len));
    }
}
