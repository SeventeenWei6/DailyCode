package org.wdzl.first.CAR;

public class KeCar extends  CarModel {
   private String seat;
   public KeCar(String number,String brand,double rent,String seat)
   {
       super(number, brand, rent);
       this.seat = seat;
   }

    @Override
    double calMoney(int day) {
        double discont = 1;
        if( day>7 && day <30)
        {
            discont = 0.9;
        }
        if(day >30 && day <30)
        {
            discont = 0.8;
        }
        if(day>150)
        {
            discont = 0.7;
        }
        return discont*this.getRent();
    }
}
