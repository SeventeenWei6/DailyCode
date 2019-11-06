package org.wdzl.first.HolidayProject2;

public class NetPackage extends ServicePackage implements NetService {

    int flow;

    public NetPackage(int price, int flow) {
        super(price);
        this.flow = flow;
    }
    @Override
    public int netPlay(MobileCard card) {

        return  this.flow - card.getRealFlow();
    }
    public  void showInfo()
    {
        System.out.println("套餐类型:网虫套餐\t\t上网流量:5GB\t\t月资费：68元");
    }
}
