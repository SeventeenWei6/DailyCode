package org.wdzl.first.ch8;

import sun.applet.resources.MsgAppletViewer;

import java.util.Scanner;

public class Master {
    public Goods getGoods(int choice) {
        Goods temp = null;
        if(choice == 1)
        {
            temp = new TVs("小米",2000);
        }
        else
        {
            temp = new Foods("海底捞",500);
        }
        return  temp;
    }
}
class MasterTest{
    public static void main(String[] args) {
        System.out.print("请输入你的选择 1为电视,2为食物:");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        Master master = new Master();
        Goods temp1 = master.getGoods(choice);
        System.out.println("该商品是:"+temp1.getName());
        temp1.printPrice();
    }
}