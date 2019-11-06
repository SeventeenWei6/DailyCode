package org.wdzl.first.Demo_1;

public class Test implements Temp3{
    private  String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public void print_All() {
        System.out.println("Just try");
    }

    @Override
    public void test_Person() {
        System.out.println(this.name);
    }

    @Override
    public void print_Animal() {
        System.out.println(this.animalName);
    }

    @Override
    public void print_Phone() {
        System.out.println(this.phone);
    }

    public static void main(String[] args) {
        Test test01 = new Test("bide");
        test01.print_All();

    }
}
