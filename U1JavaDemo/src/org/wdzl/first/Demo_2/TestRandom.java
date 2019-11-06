package org.wdzl.first.Demo_2;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int i = input.nextInt();
        Random rand = new Random(10);
        int j = rand.nextInt(10);
        if(i == j)
        {
            System.out.println("猜对了");
        }
        else
        {
            System.out.println("猜错了");
            System.out.println("该数字是:"+j);
        }

    }
}
