package org.wdzl.first.ch9;

public class Computer  {
    CPUU a1;
    EMS b1;
    HardDisk c1;
    Computer(CPUU a1,EMS b1,HardDisk c1)
    {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
    }

   void Print(){
       System.out.println("CPU的品牌是:"+a1.Brand()+",主频是:"+a1.Frequency());
       System.out.println("硬盘容量是:"+b1.Ram());
       System.out.println("内存容量是:"+c1.MaxCapacity());
   }
}
class TestComputer{
    public static void main(String[] args) {

        Computer test1 = new Computer(new Cpu("a","b"),new memory("ll"),new Hard("c"));

        test1.Print();

    }
}
