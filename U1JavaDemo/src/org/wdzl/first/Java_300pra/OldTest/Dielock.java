package org.wdzl.first.Java_300pra.OldTest;

public class Dielock {
    public static void main(String[] args) {
        Object m = new Object();
        Object g = new Object();
        lock1 lock1 = new lock1(g,m);
        lock2 lock2 = new lock2(g,m);
        Thread thread1 = new Thread(lock1);
        Thread thread2 = new Thread(lock2);
        thread1.start();
        thread2.start();
    }
}
class lock1 implements Runnable{
    Object g ;
    Object m;
    lock1(Object g,Object m)
    {
        this.g =g;
        this.m = m;
    }
    @Override
    public void run() {
        while (true)
        {
            test();
        }
    }
    public  void test()
    {
        synchronized (g)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (m)
            {

            }
            System.out.println("complete");
        }
    }
}
class lock2 implements Runnable{
    Object g ;
    Object m;
    lock2(Object g,Object m)
    {
        this.g =g;
        this.m = m;
    }
    @Override
    public void run() {
        while (true)
        {
            test2();
        }
    }
    public void test2(){
        synchronized (m)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (g)
            {

            }
            System.out.println("complete2");
        }
    }
}
