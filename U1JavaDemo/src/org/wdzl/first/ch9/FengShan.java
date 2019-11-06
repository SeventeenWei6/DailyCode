package org.wdzl.first.ch9;

public class FengShan implements Usb {

    @Override
    public void sentData(int number) {
        if(number == 1)
        System.out.println("吹风机现在为冷风");
        else if(number == 2)
        {
            System.out.println("吹风机现在为中等风");
        }
        else if(number == 3)
        {
            System.out.println("吹风机现在为热风");
        }
        else
        {
            System.out.println("请输入正确参数");
        }
    }
}
