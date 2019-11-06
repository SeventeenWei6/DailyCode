package org.wdzl.first.HolidaySeven;

public class D3_Run extends Thread{
    static int saidao = 1000;
    @Override
    public  void run() {
       while(true) {

               synchronized (this) {
                   if (saidao <= 0) {
                       break;
                   } else {
                   System.out.println(Thread.currentThread().getName() + "拿到接力棒");
                   for (int i = 0; i < 100; i += 10) {
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println(Thread.currentThread().getName() + "跑了" + (i + 10) + "米");

                   }
                   this.saidao = saidao - 100;
                   System.out.println("还剩" + saidao + "米!");
               }
           }
       }

    }
//    public  synchronized void running()
//    {
//
//        System.out.println(Thread.currentThread().getName()+"拿到接力棒");
//        for(int i = 0;i<100;i+=10)
//        {
//            try {
//                Thread.sleep(100);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"跑了"+(i+10)+"米");
//
//        }
//        this.saidao = saidao-100;
//        System.out.println("还剩"+saidao+"米!");
//    }
}
