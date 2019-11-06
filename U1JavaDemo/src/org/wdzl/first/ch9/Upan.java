package org.wdzl.first.ch9;

public class Upan implements Usb {
    @Override
    public void sentData(int number) {
        if(number == 1)
            System.out.println("读取u盘正确");
        else if(number == 2)
        {
            System.out.println("u盘正在读取数据");
        }
        else if(number == 3)
        {
            System.out.println("u盘拔出成功");
        }
        else
        {
            System.out.println("请输入正确参数");
        }
    }
}