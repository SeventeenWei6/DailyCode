package org.wdzl.first.CAR;

import org.wdzl.first.CAR.JiaoCar;
import org.wdzl.first.CAR.KeCar;
import org.wdzl.first.CAR.YeWu;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        int key = 0;
        String s1[]={"宝马","别克林荫大道",};
        String s2[]={"金龙","金杯"};
        String s3[]={"金NY28588","京CNY3284","京NT37465","京NT96968"};
        double s4[]={800,600,300,600};
        double s5[]={800,1500};
        String s6[]={"宝马550i","别克GL8"};
        String s7[]={"16座","34座"};
        String s8[]={"京8696997","京8696998","京6566754","京9696996"};
        System.out.println("***********欢迎光临腾飞汽车租赁公司***********");
        System.out.println("1、轿车     2、客车");
        System.out.print("请选择你要租赁的汽车类型:");
        Scanner input = new Scanner(System.in);
        key = input.nextInt();
        if(key == 1)
        {
            System.out.print("请选择你要租赁的轿车型号:1.宝马  2.别克林荫大道 " );
            int t = input.nextInt();
            System.out.print("请输入你要租赁的天数:");
            int d = input.nextInt();
            JiaoCar temp1 = new JiaoCar(s3[t-1],s1[t-1],s4[t-1],s6[t-1]);
            YeWu test1 = new YeWu();
            test1.Zuling(temp1,d);
        }
        else
        {
            System.out.print("请选择你要租赁的客车品牌:1.金龙 2.金杯 ");
            int t1 = input.nextInt();
            System.out.print("请选择你要租赁的汽车座位数:1.16座 2.34座 ");
            int a = input.nextInt();
            System.out.print("请输入你要租赁的天数:");
            int d1 = input.nextInt();
            KeCar temp2 = new KeCar(s8[t1+a-2],s2[t1-1],s5[t1-1],s7[t1-1]);
            YeWu test2= new YeWu();
            test2.Zuling(temp2,d1);
        }
    }
}
