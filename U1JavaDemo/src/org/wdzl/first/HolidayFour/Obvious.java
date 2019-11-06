package org.wdzl.first.HolidayFour;

import java.util.Observable;

public class Obvious extends Observable {
    private  float price;

    public Obvious(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}
