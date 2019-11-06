package org.wdzl.first.HolidayTen;

public class D1_TempPerson {
    private String name;
    private  int age;

    public D1_TempPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public D1_TempPerson(){

    }
    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
