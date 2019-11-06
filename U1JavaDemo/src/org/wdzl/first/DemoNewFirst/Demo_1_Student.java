package org.wdzl.first.DemoNewFirst;

public class Demo_1_Student {
    public String name;
    private int age;
    private String ID;

    public Demo_1_Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }
    public Demo_1_Student()
    {

    }
    private Demo_1_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    private void show()
    {
        System.out.println("SHOW");
    }
    @Override
    public String toString() {
        return "Demo_1_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                '}';
    }
}
