package org.wdzl.first.ch8;

public abstract class Goods {
   private String name;
   private int  price;
    Goods(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    abstract  void printPrice();
}
