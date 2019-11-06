package org.wdzl.first.HolidayOne;

public class DolphinDemo extends  AnimalModel implements LegInterface {
    private  int leg;
    DolphinDemo(String name,int leg){
        super(name);
        this.leg = leg;
    }

    @Override
    void shout() {
        System.out.println("海豚音");
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public int getLeg() {
        return leg;
    }
}
