package org.wdzl.first.Java_300pra.OldTest;

public class DemoShengAndXiao {
    String temp;
    private boolean flag =true;
    public  synchronized void Sheng(String temp)
    {
        if(!flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("生产了:"+temp);
        this.temp = temp;
        this.notify();
        flag = false;
    }
    public synchronized void Xiao(){
        if(flag == true)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费了"+temp);
        this.notify();
        flag = true;
    }
}
