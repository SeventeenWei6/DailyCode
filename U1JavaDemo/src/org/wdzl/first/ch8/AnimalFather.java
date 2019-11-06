package org.wdzl.first.ch8;

public abstract  class AnimalFather {
    private  String name;
    private  String sex;
    AnimalFather(String name,String sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    abstract  void  EatSomething();
}
class  AnimalTest{
    public static void main(String[] args) {
        AnimalFather temp1 = new Penguin("Q仔","man");
        System.out.println("姓名:"+temp1.getName()+" 性别:"+temp1.getSex()+" 特有方法");
        ((Penguin) temp1).Swim();
        AnimalFather temp2 = new Dog("小黑","man");
        System.out.println("姓名:"+temp2.getName()+" 性别:"+temp2.getSex()+" 特有方法");
        ((Dog) temp2).flyPan();
        System.out.println(temp1 instanceof Penguin);
        System.out.println(temp2 instanceof Dog);
    }
}
