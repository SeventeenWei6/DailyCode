package org.wdzl.first.HolidayOne;

public class Student {
    private  String name;
    private  String Id;

    public Student(String name, String id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }
}
