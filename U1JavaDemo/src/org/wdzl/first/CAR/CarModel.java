package org.wdzl.first.CAR;

public abstract class CarModel {
    private  String number;
    private String brand;
    private double rent;
    CarModel(String number,String brand,double rent)
    {
        this.number = number;
        this.brand = brand;
        this.rent = rent;
    }
    abstract  double  calMoney(int day);

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
}
