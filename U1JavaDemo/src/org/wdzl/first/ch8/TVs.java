package org.wdzl.first.ch8;

public class TVs extends Goods {
    TVs(String name,int price)
    {
        super(name,price);
    }

    @Override
    void printPrice() {
        System.out.println("此电视价格:"+this.getPrice());

    }
}
class Foods extends Goods{
    Foods(String name,int price)
    {
        super(name,price);
    }

    @Override
    void printPrice() {
        System.out.println("此食物价格:"+this.getPrice());
    }
}
