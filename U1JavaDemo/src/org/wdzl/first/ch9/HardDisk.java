package org.wdzl.first.ch9;

public interface HardDisk {
    public String MaxCapacity();
}
class Hard implements HardDisk{
     String maxCapacity;
    Hard(String maxCapacity){
        this.maxCapacity = maxCapacity;
    }
    @Override
    public String MaxCapacity() {
        return this.maxCapacity;
    }
}