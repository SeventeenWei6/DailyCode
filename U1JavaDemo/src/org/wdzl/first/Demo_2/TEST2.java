package org.wdzl.first.Demo_2;

public class TEST2 {
    public static void main(String[] args) {
        Animall temp1 = new Animall();
        Bird b = new Bird(temp1);
        b.breath();
        b.fly();
        Animall temp2 = new Animall();
        Wolf c = new Wolf(temp2);
        c.breath();
        c.run();
    }

}
class  Animall{
    private  void beat()
    {
        System.out.println("心脏跳动");
    }
    public void breath()
    {
        beat();
        System.out.println("吸一口气，吐一口气，呼吸中。。。");
    }
}
class Bird
{
    private Animall a;
    public Bird(Animall a )
    {
        this.a = a;
    }
    public void breath()
    {
        a.breath();
    }
    public  void fly()
    {
        System.out.println("在天上飞");
    }
}
class  Wolf{
    private Animall a ;
    public Wolf(Animall a)
    {
        this.a = a;
    }
    public void breath()
    {
        a.breath();
    }
    public  void run()
    {
        System.out.println("跑");
    }
}