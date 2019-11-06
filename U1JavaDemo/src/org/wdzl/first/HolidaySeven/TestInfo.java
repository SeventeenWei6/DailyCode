package org.wdzl.first.HolidaySeven;

public class TestInfo {
    public static void main(String[] args) {
        Info info = new Info();
        Produce p = new Produce(info);
        Consumer c = new Consumer(info);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
