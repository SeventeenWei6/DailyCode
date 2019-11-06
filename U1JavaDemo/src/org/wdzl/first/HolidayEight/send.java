package org.wdzl.first.HolidayEight;


import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class send implements Runnable {
    DataOutputStream dos;

    public send( DataOutputStream dos) {
        this.dos = dos;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        String message ;
        while (true)
            try {

                message = input.next();
                dos.writeUTF(""+message);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
