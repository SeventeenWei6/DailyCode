package org.wdzl.first.ch9;

public interface CPUU {
    public  String Brand();
    public  String Frequency();
}
class Cpu implements  CPUU{
    String brand;
    String frequency;
    Cpu(String brand,String frequency){
        this.brand = brand;
        this.frequency=frequency;
    }
    @Override
    public String Brand() {
        return  this.brand;
    }
    @Override
    public String Frequency() {
        return this.frequency;
    }
}