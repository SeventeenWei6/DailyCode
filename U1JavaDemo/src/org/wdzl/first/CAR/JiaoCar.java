package org.wdzl.first.CAR;

public class JiaoCar extends CarModel{
    String size;
    public JiaoCar(String number,String brand,double rent,String size)
    {
        super(number, brand, rent);
        this.size = size;
    }

    @Override
    double calMoney(int day) {
        double discont = 1;
        if( day>=3 && day <7)
        {
            discont = 0.9;
        }
        if(day >=7 && day <30)
        {
            discont = 0.8;
        }
        if(day>=30 && day < 150)
        {
            discont = 0.7;
        }
        if(day>150)
        {
            discont = 0.6;
        }
        return discont*this.getRent();
    }
}
