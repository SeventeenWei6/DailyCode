package org.wdzl.first.Demo_2;

public class Test{

    public static void main(String[] args) {
        /*Son temp = new Son("zhangsan",123,78);
        System.out.println(temp.tag);
        temp.soutPrint();*/
        dog d  = new dog();
        animalShout(d);
    }
    static void animalShout(Animal a){
        a.shout();
    }
}
class Parent{
    public String tag = "EZ4ENCE";
    private String name;
    public int number;
    public Parent(String name,int number){
        this.name = name;
        this.number = number;
    }
    public void soutPrint()
    {
        System.out.println(this.name);
    }
}
class Son extends Parent {

    public String tag = "Nice shoot";
    private int score;
    public Son(String name,int number,int score)
    {
        super(name,number);
        this.score = score;

    }
    public void soutPrint()
    {
        System.out.println();
    }
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class cat extends Animal{
    public void shout() {
        System.out.println("喵喵喵");
    }
}
