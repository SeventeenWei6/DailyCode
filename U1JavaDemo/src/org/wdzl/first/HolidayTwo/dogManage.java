package org.wdzl.first.HolidayTwo;

public class dogManage {
    private String name;
    private int age;
    private double weight;
    private String Jieshao;

    public dogManage(String name, int age, double weight, String jieshao) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.Jieshao = jieshao;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getJieshao() {
        return Jieshao;
    }
}
