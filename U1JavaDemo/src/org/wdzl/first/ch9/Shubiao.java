package org.wdzl.first.ch9;

public class Shubiao implements Usb {
    @Override
    public void sentData(int number) {
        if(number == 1)
            System.out.println("鼠标左键");
        else if(number == 2)
        {
            System.out.println("鼠标右键");
        }
        else if(number == 3)
        {
            System.out.println("鼠标滚轮");
        }
        else
        {
            System.out.println("请输入正确参数");
        }
    }
}
