package org.wdzl.first.ch9;

public class FinishMohe implements MoHe{
    String color;
    FinishMohe(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

}
