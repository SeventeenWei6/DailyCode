package org.wdzl.first.HolidayOne;

public abstract  class AnimalModel {
    private  String name;
    AnimalModel(String name)
    {
        this.name = name;
    }
    abstract  void shout();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
