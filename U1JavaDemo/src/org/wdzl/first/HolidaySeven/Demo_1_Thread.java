package org.wdzl.first.HolidaySeven;

public class Demo_1_Thread extends  Thread {
    Demo_1_Thread(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        for(int i = 0; i< 500;i++)
        {
            System.out.println(getName()+":"+i+" ");
           // Thread.yield();
        }
    }
}
