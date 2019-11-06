package org.wdzl.first.HolidaySeven;

public class D1_MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 50;i++)
        {
            System.out.println(getName()+":"+i);
        }
    }
}
