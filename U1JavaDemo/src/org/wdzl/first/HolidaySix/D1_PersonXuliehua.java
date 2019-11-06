package org.wdzl.first.HolidaySix;

import java.io.Serializable;

/*
* 序列化和反序列化
*
* */
public class D1_PersonXuliehua implements Serializable {
    private static final long serialVersionUID = 1L;
    private  String name;
    private  int age;

    public D1_PersonXuliehua(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }*/

}
