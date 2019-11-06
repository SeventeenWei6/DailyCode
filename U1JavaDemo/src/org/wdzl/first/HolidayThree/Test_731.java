package org.wdzl.first.HolidayThree;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test_731 {
//  No.1  static Week  Choice(int i)
//    {
//        if(i == 1) return Week.MON;
//        else if(i == 2) return Week.TUE;
//        else if(i == 3) return Week.SAT;
//        else if(i == 4) return Week.THU;
//        else if(i == 5) return Week.FRI;
//        else if(i == 6) return Week.SAT;
//        else
//            return Week.SUN;
//    }
    public static void main(String[] args) {
//      No.1  Scanner input = new Scanner(System.in);
//        System.out.print("请输入你要输入的星期：");
//        int choice = input.nextInt();
//        Week temp = Choice(choice);
//        switch (temp )
//        {
//            case MON:
//            case TUE:
//            case WED:
//            case THU:
//            case FRI:
//                System.out.println("工作日，努力写代码！");
//                break;
//            case SAT:
//            case SUN:
//                System.out.println("休息日休息！");
//            break;
//        }
//      NO.2   switch (Week.U1)
//         {
//             case U1:
//                 System.out.println("第一单元打基础");
//             case U2:
//                 System.out.println("第二单元可以胜任Java程序开发");
//             case U3:
//                 System.out.println("第三单元可以胜任企业级Java开发");
//         }

//      No.3   String str = String.valueOf('c');//valueOf(type value)方法；
//        System.out.println(str);
//        String str1= String.valueOf("asdasd");
//        System.out.println(str1);//valueOf(String s)方法；
//        Integer i = 10;//Integer i = new Integer(10);
//        Byte j = 9;//Byte j = new Byte(9);
//        int k  = i;// int k = i.intValue();
//        Byte l = j;//Byte l = j.ByteValue();
//        String str2 = "12";
//        Integer int1 = Integer.parseInt(str2);// 将String类型转化为int
//        System.out.println(int1);
//        String str3= "12.1";//将String类转换为double
//        Double dou1 = Double.parseDouble(str3);
//        System.out.println(dou1);
//        String str4 = "true";//将String类转换为boolean
//        Boolean boo1 = Boolean.parseBoolean(str4);
//        System.out.println(boo1);
//        String str5 = "1";//将String类转换为byte
//        Byte by1 = Byte.parseByte(str5);
//        System.out.println(by1);
//        int int2 = 111;
//        String str6 = String.valueOf(int2);//将int类转换String
//        System.out.println(str6);
//        boolean  boo2 = true;//将boolean转换为String
//        String str7 = String.valueOf(boo2);
//        System.out.println(str7);

//  No.4      System.out.println("我行我素购物管理系统->幸运抽奖");
//        System.out.print("请输入四位会员号:");
//        Scanner input = new Scanner(System.in);
//        int ch = input.nextInt();
//        int temp = (int)Math.random()*10;
//        if((ch%100)/10 == temp)
//        {
//
//            System.out.println(ch+"是幸运客户,获得MP3");
//        }
//        else
//        {
//            System.out.println("很遗憾不是幸运客户");
//        }
//
//  No.5  Random r = new Random();
//        for(int i = 0;i < 20;i++)
//        {
//            System.out.println(r.nextInt(10));
//        }
//
//  No.6  Scanner input = new Scanner(System.in);
//        System.out.print("请输入一个用户名:");
//        String name = input.next();
//        System.out.print("请输入密码:");
//        String password = input.next();
//        if(password.length() < 6)
//        {
//            System.out.println("密码长度不能小于6位");
//        }
//        else
//        {
//            System.out.println("注册成功!");
//        }
//
//  No.7  String user = "zhangwei";
//        String mima = "123456" ;
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入一个用户名:");
//        String name = input.next();
//        System.out.print("请输入密码:");
//        String password = input.next();
//        if(user.equals(name) && mima.equals(password))
//        {
//            System.out.println("登录成功!");
//        }
//        else
//        {
//            System.out.println("用户名或密码不匹配，登陆失败!");
//        }

//  No.8  String s ="abc";
//        String s1 = "abc";
//        System.out.println(s == s1);
//        System.out.println(s.equals(s1));
//        String s2 = new String("abc");
//        String s3 = new String("abc");
//        System.out.println(s2 == s3);
//        System.out.println(s2.equals(s3));

// No.9   String s = "zhangwei";
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入一个用户名:");
//        String name = input.next();
//        if(name.equalsIgnoreCase(s))
//        {
//            System.out.println("登陆成功");
//        }

// No.10  Scanner input = new Scanner(System.in);
//        int flag = 1;
//        do{System.out.print("请输入一个用户名:");
//            String name = input.next();
//            System.out.print("请输入密码:");
//            String password = input.next();
//            if(name.length()<3)
//            {
//                flag = 0;
//                System.out.println("用户名不合法");
//                continue;
//            }
//            if(password.length()<6)
//            {
//                flag = 0;
//                System.out.println("密码长度不小于6");
//                continue;
//            }
//            System.out.print("请再次输入密码:");
//            String password1 = input.next();
//            if(!password.equals(password1))
//            {
//                flag = 0;
//                System.out.println("两次密码必须一致!");
//                continue;
//            }
//            System.out.println("注册成功!");
//            break;
//        }while (flag ==0);

// No.11  System.out.println("*****成绩单*****");
//        String SQL = "SQL";
//        String Java = "Java";
//        String HTML = "HTML";
//        String name = "北大青鸟";
//        String name1 = "版权所有:";
//        int i = 80;
//        int j =90;
//        double  k  = 86.7;
//        System.out.println(SQL+i+'\t'+Java+j+'\t'+HTML+k);
//        System.out.println(name1.concat(name));

//  No.12    Scanner input = new Scanner(System.in);
//        System.out.print("请输入Java文件名:");
//        String wenjian = input.next();
//        System.out.print("请输入你的邮箱:");
//        String email = input.next();
//        int k = wenjian.lastIndexOf('.');
//        int l = wenjian.length();
//        if(!wenjian.substring(k,l).equals(".java"))
//        {
//            System.out.println("文件名字不合法");
//        }
//        if(email.contains("@") && email.contains("."))
//        {
//            if(email.lastIndexOf("@") > email.lastIndexOf("."))
//            {
//
//                System.out.println("E-mail无效");
//                System.out.println("作业提交失败!");
//            }
//            else
//            {
//                System.out.println("作业提交成功!");
//            }
//        }
//        else
//        {
//            System.out.println(2);
//            System.out.println("E-mail无效");
//            System.out.println("作业提交失败!");
//        }

// No.13  String  str = "长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山";
//        String str1[] = str.split(" ");
//        for(int i =0;i < str1.length;i++)
//        {
//            System.out.println(str1[i]);
//        }

// No.14      Scanner input = new Scanner(System.in);
//        System.out.println("请输入一个字符串:");
//        String str = input.next();
//        System.out.println("请输入要查找的字符:");
//        String str1 = input.next();
//        String str2[] = str.split(str1);
//        System.out.println(str+"中一共出现了 "+(str2.length-1)+" 次"+str1);

// No.15  Scanner input = new Scanner(System.in);
//        System.out.print("请输入一串数字:");
//        String str = input.next();
//        StringBuffer str1 = new StringBuffer(str);
//        for(int i = str.length()-3;i >=0;i=i-3)
//        {
//            str1.insert(i,'.');
//        }
//        System.out.println(str1);

// No.16     Date date = new Date();
//        SimpleDateFormat m = new SimpleDateFormat("当前时间: yyyy-MM-dd HH:mm:ss");
//        System.out.println(m.format(date));

// No.17     Calendar cal = Calendar.getInstance();
//        System.out.println("今天是" + cal.get(Calendar.YEAR) + "年" + ((cal.get(Calendar.MONTH)) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
//        System.out.println("今天" + "星期"+cal.get(Calendar.DAY_OF_WEEK));

//        Date date = new Date();
//        SimpleDateFormat m = new SimpleDateFormat("当前时间: yyyy-MM-dd HH:mm:ss");
//        System.out.println(m.format(date));
//        Calendar c = Calendar.getInstance();
//将周一(FirstDay)设为每周的第一天(monday)
//        c.setFirstDayOfWeek(Calendar.MONDAY);
//将年份设为2015年
//        c.set(Calendar.YEAR, 2015);
//将月份设为4月(java中0-11代表12个月)
//        c.set(Calendar.MONTH, 4);
//将日数设为第6日
//        c.set(Calendar.DATE,6);
//使用Calendar.WEEK_OF_YEAR来求出属于某年的第几周
//        System.out.println("2015年4月6日是"+c.get(Calendar.WEEK_OF_YEAR)+"周");

    }
}
