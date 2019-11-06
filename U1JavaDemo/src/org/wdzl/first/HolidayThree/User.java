package org.wdzl.first.HolidayThree;

import java.util.Random;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int flag = 1;
//        System.out.print("请输入一个用户名:");
//        String name = input.next();
//        if(name.length()>=6 )
//        {
//            flag =0;
//        }
//        for(int i = 0;i < name.length();i++)
//        {
//            if(Character.isDigit(name.charAt(i)))
//            {
//                flag = 0;
//                break;
//            }
//            if(Character.isLowerCase(name.charAt(i)) || Character.isUpperCase(name.charAt(i)))
//            {
//                flag = 0;
//                break;
//            }
//        }
//        if(flag == 1)
//        {
//            System.out.println("用户名不合法");
//        }
//        else
//        {
//            System.out.println("用户名合法");
//        }

//        String s = "asdasd15151asdB255";
//        int D = 0;
//        int X = 0;
//        int n = 0;
//        int t = 0;
//        for(int i =0; i < s.length();i++)
//        {
//            if(Character.isDigit(s.charAt(i)))
//            {
//                n++;
//            }
//            else if(Character.isUpperCase(s.charAt(i)) )
//            {
//                D++;
//
//            }
//
//            else if( Character.isLowerCase(s.charAt(i)))
//            {
//                X++;
//            }
//            else
//            {
//                t++;
//            }
//        }
//        System.out.println("字符串数字有:"+n);
//        System.out.println("字符串大写字母有:"+D);
//        System.out.println("字符串小写字母有:"+X);
//        System.out.println("字符串特殊字符有:"+t);
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入密码:");
//        String password = input.next();
//        int flag = 1;
//        if(password.length()>=8)
//        {
//            flag = 0;
//        }
//        for(int i = 0;i < password.length();i++)
//        {
//            if(Character.compare(password.charAt(i),'$')==0 || Character.compare(password.charAt(i),'_')==0)
//            {
//                flag = 0;
//                break;
//            }
//        }
//        if(flag == 0)
//        {
//            System.out.println("密码合格");
//        }
//        else
//        {
//            System.out.println("密码不合格");
//        }
//    }
//    double s = 123.45478;
//    String d = String.format("%.2f", s );
//        System.out.println(d);
//        String s = "123456asda%_sa";
//        int o = 0;
//        int a = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.compare(s.charAt(i), '$') == 0) {
//                o++;
//            }
//            if (Character.compare(s.charAt(i), '_') == 0) {
//                a++;
//            }
//        }
//        System.out.println("'$'一共有:" + o);
//        System.out.println("'_'一共有:" + a);
//        int redball_user[] = new int[6];
//        int blueball_user;
//        int blueball_Sys;
//        int[] redball_Sys = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
//        boolean isblue;
//        boolean isred;
//        int count = 0;
//        Random r = new Random();
//        Scanner input = new Scanner(System.in);
//
//        blueball_Sys = r.nextInt(16)+1;
//        for(int i = 0;i<redball_user.length;i++)
//        {
//            while(true)
//            {
//                int temp = r.nextInt(33);
//                if(redball_Sys[temp]!=0) {
//                    redball_user[i] = redball_Sys[temp];
//                    redball_Sys[temp] = 0;
//                    break;
//                }
//
//            }
//        }
//
//        System.out.println("*******欢迎来到双色球小程序!*******");
//        System.out.println("请选择你抽取的篮球(1~16)号码:");
//        blueball_user = input.nextInt();
//        System.out.print("请选择你抽取的6个红球(1~33)号码:");
//        for(int i = 0;i<redball_user.length;i++)
//        {
//            redball_user[i] = input.nextInt();
//        }
//        if(blueball_Sys == blueball_user)
//        {
//            isblue = true;
//        }
//        for(int i = 0;i < redball_user.length;i++)
//        {
//            for(int j = 0;j <redball_Sys.length;j++)
//            {
//                if(redball_Sys[j] == redball_user[i])
//                {
//                    count++;
//                }
//            }
//
//        }
        System.out.println("系统版本:"+System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));

    }
}
