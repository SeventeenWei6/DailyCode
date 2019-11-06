package org.wdzl.first.Java_300pra.OldTest;

public class Tthread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<100;i++)
        {
            System.out.println("线程1跑了"+i+"次");
        }
    }
}
