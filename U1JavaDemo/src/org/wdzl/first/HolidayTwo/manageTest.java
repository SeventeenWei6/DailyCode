package org.wdzl.first.HolidayTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class manageTest {
    public static void main(String[] args) {
        List<dogManage> dog = new ArrayList<dogManage>();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {

            System.out.println("******************************");
            System.out.println("欢迎来到狗狗管理系统");
            System.out.println("1.狗之添加");
            System.out.println("2.狗之排序");
            System.out.println("3.狗之最大");
            System.out.println("4.狗之最重");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("请输入狗的姓名:");
                    String name = input.next();
                    System.out.print("请输入狗的年龄:");
                    int age = input.nextInt();
                    System.out.print("请输入狗的体重:");
                    double weight = input.nextDouble();
                    System.out.print("请输入狗的介绍:");
                    String Jieshao = input.next();
                    dogManage dogtemp = new dogManage(name,age,weight,Jieshao);
                    dog.add(dogtemp);
                    System.out.println("添加成功!按0返回");
                    choice = input.nextInt();
                    break;
                case 2:
                    ComparatorByage t = new ComparatorByage();
                    Collections.sort(dog,t);
                    System.out.println("排序后数据：");
                    for (dogManage dogs : dog) {
                        System.out.println(dogs.getName()+"----》"+dogs.getAge()+"----》"+dogs.getWeight()+"----》"+dogs.getJieshao());

                    }
                    System.out.println("排序成功!按0返回");
                    choice = input.nextInt();
                    break;
                case 3:
                    ComparatorByage m = new ComparatorByage();
                    dogManage max = Collections.max(dog,m);
                    System.out.println("年龄最大狗："+max.getName()+"----》"+max.getAge());
                    System.out.println("查找成功!按0返回");
                    choice = input.nextInt();
                    break;
                case 4:
                    ComparatorByweight w = new ComparatorByweight();
                    dogManage maxw = Collections.max(dog,w);
                    System.out.println("体重最大狗："+maxw.getName()+"----》"+maxw.getWeight());
                    System.out.println("查找成功!按0返回");
                    choice = input.nextInt();
                    break;
                default:
                    break;

            }
        }while(choice==0);


    }
}
