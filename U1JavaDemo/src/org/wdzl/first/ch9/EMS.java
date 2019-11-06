package org.wdzl.first.ch9;

public interface EMS {
    public String Ram();
}
class memory implements  EMS{
      String ram;
    memory(String ram){
        this.ram= ram;
    }

    @Override
    public String Ram() {
        return this.ram;
    }
}