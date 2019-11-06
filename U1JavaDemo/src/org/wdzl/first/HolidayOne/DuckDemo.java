package org.wdzl.first.HolidayOne;

public class DuckDemo extends AnimalModel implements LegInterface{
    private  int leg;
    DuckDemo(String name,int leg)
    {
        super(name);
        this.leg = leg;
    }

    @Override
    void shout() {
        System.out.println("嘎嘎嘎");
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public int getLeg() {
        return leg;
    }
}
