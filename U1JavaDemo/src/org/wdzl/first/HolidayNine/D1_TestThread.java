package org.wdzl.first.HolidayNine;

public class D1_TestThread {
    public static void main(String[] args) {
        D1_Test temp = new D1_Test();
        D1_RTest t = new D1_RTest();
        Thread s = new Thread(temp);
        Thread s1 = new Thread(t);
//        s.start();
         s1.start();
    }
}
