package org.wdzl.first.HolidayOne;

public class CatDemo extends  AnimalModel implements  LegInterface{
    private  int leg;
    CatDemo(String name,int leg)
    {
        super(name);
        this.leg = leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    void shout() {
        System.out.println("喵喵喵");
    }

    @Override
    public int getLeg() {
        return this.leg;
    }
}
