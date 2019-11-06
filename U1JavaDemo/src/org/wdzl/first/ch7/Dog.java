package org.wdzl.first.ch7;

public class Dog extends Pat{
    private String strain;

    public Dog(String name, double health, int love,String strain) {
        super(name,health,love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }
    public  void print(){
        super.print();
        System.out.println("种类:"+this.getStrain());
    }
}
