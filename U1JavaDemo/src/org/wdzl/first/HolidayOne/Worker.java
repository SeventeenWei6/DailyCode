package org.wdzl.first.HolidayOne;

public class Worker {
    private String Id;
    private String name;
    private int age;

    public Worker(String id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
