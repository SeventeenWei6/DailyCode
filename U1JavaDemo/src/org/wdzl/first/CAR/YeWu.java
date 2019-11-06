package org.wdzl.first.CAR;

public class YeWu {
    public  void Zuling(CarModel car,int day)
    {
        System.out.println("分配给你的汽车车牌号:"+car.getNumber());
        System.out.println("你需要支付的费用:"+car.calMoney(day));
    }
}
