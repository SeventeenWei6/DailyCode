package org.wdzl.first.Java_300pra.OldTest;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
//
        new JoinThread("new Thread").start();
        for(int i =  0;i <10;i++)
        {
            if(i==5)
            {
                JoinThread jt = new JoinThread("被Join的线程");
                jt.start();
                //main线程调用了jt线程的join()方法,main线程必须等JT线程结束才会向下执行
                jt.join();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
class JoinThread extends Thread{
    public JoinThread(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+""+i);
        }
    }
}
