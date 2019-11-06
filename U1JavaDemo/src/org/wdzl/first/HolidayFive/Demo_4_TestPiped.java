package org.wdzl.first.HolidayFive;

import java.io.IOException;

public class Demo_4_TestPiped {
    public static void main(String[] args) {
        Demo_4_send send = new Demo_4_send();
        Demo_4_Receive receive = new Demo_4_Receive();

        try{
            send.pos.connect(receive.pis);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        new Thread(send).start();
        new Thread(receive).start();
    }

}
