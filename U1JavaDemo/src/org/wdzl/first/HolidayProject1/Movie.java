package org.wdzl.first.HolidayProject1;
/*
* 电影属性类
*
* */
public class Movie {
    private String name;
    private String Ename;
    private String director;
    private String actor;
    private String type;
    private double price;

    public Movie(){

    }
    public Movie(String name, String ename, String director, String actor, String type, double price) {
        this.name = name;
        Ename = ename;
        this.director = director;
        this.actor = actor;
        this.type = type;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
