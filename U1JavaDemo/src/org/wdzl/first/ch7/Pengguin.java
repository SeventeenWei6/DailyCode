package org.wdzl.first.ch7;

public class Pengguin extends Pat {
    private String sex;

    public Pengguin(String name, int health, int love,String sex) {
        super(name,health,love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
    public  void print()
    {
        super.print();
        System.out.println("种类:"+this.getSex());
    }
}
