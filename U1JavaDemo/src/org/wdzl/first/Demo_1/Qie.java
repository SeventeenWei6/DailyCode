package org.wdzl.first.Demo_1;

import org.wdzl.first.ch1.Student;

import java.util.Scanner;

public class Qie {
    public static void main(String[] args) {
        Student OO = new Student();
        org.wdzl.first.ch2.Student pp = new org.wdzl.first.ch2.Student();
        int c;
        Scanner input = new Scanner(System.in);
        Qi test1 = new Qi();
        System.out.print("请输入要领养的宠物名字:");
        test1.setName(input.nextLine());
        System.out.print("请输入要领养宠物类型:(1.企鹅 2.狗)");
        c = input.nextInt();
        switch(c)
        {
            case 1:
                System.out.print("请选择宠物性别(1.Q仔 2.Q妹)");
                test1.setSex(input.nextInt());
                System.out.print("请输入宠物健康值");
                test1.setHealth(input.nextInt());
                System.out.println("请输入请密度");
                test1.setLove(input.nextInt());
                System.out.println("宠物的自白:");
                test1.Zibai();
            case 2 :
                System.out.print("请选择宠物性别(1.狗仔 2.狗妹)");
                test1.setSex(input.nextInt());
                System.out.print("请输入宠物健康值");
                test1.setHealth(input.nextInt());
                System.out.println("请输入请密度");
                test1.setLove(input.nextInt());
                System.out.println("宠物的自白:");
                test1.Zibai();


        }

    }
}

class Qi{
    private  String name;
    private  int health = 60;
    private  int love;
    private  String sex;
    private  String type;

    public void setHealth(int health) {
        if(health > 100 || health <0)
        {
            System.out.println("宠物健康值应该再0 ~ 100 之间  默认值60");
        }
        else {
            this.health = health;
        }
    }

    public void setSex(int temp) {
        if(temp == 1)
        {
            this.sex = "Q仔";
        }
        else
        {
            this.sex = "Q妹";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int key) {
        if(key == 1)
        {
            this.type = "狗狗";
        }
        else
        {
            this.type = "企鹅";
        }

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public  void Zibai(){
        System.out.println("我的宠物名字:"+this.getName()+"健康值:"+this.getHealth()+"亲密度:"+this.getLove());
    }
}