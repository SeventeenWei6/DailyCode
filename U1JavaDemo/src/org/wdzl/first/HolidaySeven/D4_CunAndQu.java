package org.wdzl.first.HolidaySeven;

public class D4_CunAndQu extends  Thread{
    static  int money = 50;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (money >= 200) {
                    break;
                }
                cun();
                qu();
            }

        }
    }
    public synchronized void cun()
    {
       try {

           Thread.sleep(1000);
       }
       catch (InterruptedException e)
       {
           e.printStackTrace();
       }
        money = money+50;
        System.out.println(Thread.currentThread().getName()+" 向里面存50元");
        System.out.println("账户还剩:"+money+"元");
    }
    public  synchronized void  qu()
    {
        if(money > 0) {
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money = money - 25;
            System.out.println(Thread.currentThread().getName() + " 从里面取了25元");
            System.out.println("账户还剩:"+money+"元");
        }
    }

}
