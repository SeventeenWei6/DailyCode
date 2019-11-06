package org.wdzl.first.Java_300pra.OldTest;

public class T2thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("线程2跑了"+i+"次");
        }
    }
}
