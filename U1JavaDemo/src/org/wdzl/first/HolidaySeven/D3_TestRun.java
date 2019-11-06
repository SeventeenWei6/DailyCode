package org.wdzl.first.HolidaySeven;

public class D3_TestRun {
    public static void main(String[] args) {
        D3_Run run = new D3_Run();

        Thread t1 = new Thread(run,"No.1");
        Thread t2 = new Thread(run,"No.2");
        Thread t3 = new Thread(run,"No.3");
        t1.start();
        t2.start();
        t3.start();
    }
}
