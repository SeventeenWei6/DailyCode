package org.wdzl.first.Demo_2;

import java.util.Arrays;
import java.util.Scanner;
 class ArrayDemo {

    public static void main(String[] args) {
        Person a = new Person("张三",1);
        System.out.println(a);

    }
}
class Root
{
    static int age = 7;
    static{
        System.out.println("no.1");
    }
    {
        System.out.println("no.2");
    }
    public Root() {
        System.out.println("无参no.3");
    }
}
class Mid extends Root{
    static int age = 8;

    static {
        System.out.println("no.4");
    }
    {
        System.out.println("no.5");
    }
    public Mid(){
        System.out.println("无参no.6");
    }
    public Mid(String name)
    {
        this();
        System.out.println(name);
    }
}
class leaf extends Mid{

    static {
        System.out.println("no.7");
    }
    {
        System.out.println("no.8");
    }
    public leaf()
    {
        super("JAVA");
        System.out.println("no.9");
    }
}
class Person{
     private  String name;
     private  double sex;
     public Person(String name,double sex){
         this.name = name;
         this.sex = sex;
     }
     public String toString()
     {
         return "一个人，名字是:"+name+",性别是"+sex;
     }

}
