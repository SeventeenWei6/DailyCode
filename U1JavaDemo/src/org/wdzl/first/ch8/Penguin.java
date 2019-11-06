package org.wdzl.first.ch8;

public class Penguin extends AnimalFather{
     Penguin(String name,String sex){
         super(name,sex);
     }

    @Override
    void EatSomething() {
        System.out.println("I'm Penguin");
    }
    void Swim()
    {
        System.out.println("我可以游泳，我是企鹅");
    }
}
class Dog extends AnimalFather{
    Dog(String name,String sex){
        super(name,sex);
    }

    @Override
    void EatSomething() {
        System.out.println("I'm Dog");
    }
    void  flyPan(){
        System.out.println("我可以接飞盘，我是狗狗");
    }
}
