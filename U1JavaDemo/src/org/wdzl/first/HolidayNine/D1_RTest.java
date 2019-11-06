package org.wdzl.first.HolidayNine;

public class D1_RTest implements  Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println("count = "+i);
        }
    }
}
