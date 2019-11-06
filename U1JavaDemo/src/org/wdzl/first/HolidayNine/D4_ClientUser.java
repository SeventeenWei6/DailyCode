package org.wdzl.first.HolidayNine;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class D4_ClientUser {
    public static void main(String[] args) throws IOException {
       Thread t1= new Thread(new D4_MoreThreadN());
//       Thread t2 =  new Thread(new D4_MoreThreadN());
//       Thread t3 = new Thread(new D4_MoreThreadN());
       t1.start();
//       t2.start();
//       t3.start();
    }
}
