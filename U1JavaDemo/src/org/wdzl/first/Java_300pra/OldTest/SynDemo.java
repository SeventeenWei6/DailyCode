package org.wdzl.first.Java_300pra.OldTest;
/*
* 单例创建模式
* 1.构造器私有化
* 2.声明私有的静态属性
* 3.对外提供访问属性的静态方法，确保该对象存在。
* */
public class SynDemo {

    private static SynDemo temp = null;
    private SynDemo()
    {

    }

    public static  SynDemo getTemp(long time) {
        if(null == temp)
        {
            synchronized(SynDemo.class)  //双重checking
            {
                if(null == temp) {
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    temp = new SynDemo();
                }
            }

        }
        return temp;
    }
}
class Threadtest extends Thread{
    private long time;
    public Threadtest(long time)
    {
        this.time = time;
    }
    public Threadtest()
    {

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->创建的对象"+SynDemo.getTemp(time));
    }
}
class TestSyn{
    public static void main(String[] args) {
//        SynDemo temp1 = SynDemo.getTemp();
//        SynDemo temp2 = SynDemo.getTemp();
//        System.out.println(temp1);
//        System.out.println(temp2);
        Threadtest threadtest1 = new Threadtest(500);
        Threadtest threadtest2 = new Threadtest(1000);
        threadtest1.start();
        threadtest2.start();
    }
}