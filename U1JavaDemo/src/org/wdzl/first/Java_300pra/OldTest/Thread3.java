package org.wdzl.first.Java_300pra.OldTest;

public class Thread3 implements Runnable {
    private  int num = 10;
    private  boolean flag = true;
    @Override
    public void run() {
        while(flag){
            test();
        }
    }
    public synchronized void test()
    {
        if(num <=0)
        {
           flag = false;
            return;
        }
//        try {
//            Thread.sleep(500);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+"拿到了第"+num+"张票");
        num--;
    }
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread t1 = new Thread(thread3, "张三");
        Thread t2 = new Thread(thread3, "李四");
        Thread t3 = new Thread(thread3, "王麻子");
        t1.start();
        t2.start();
        t3.start();
    }
}
//class  test1{
//    public static void main(String[] args) {
//        Thread3 thread3 = new Thread3();
//        new Thread(thread3).start();
//        for(int i = 0; i <=1000;i++)
//        {
//            if(i == 500)
//            {
//                thread3.stop();
//            }
//            System.out.println("main..."+i);
//        }
//    }
//}