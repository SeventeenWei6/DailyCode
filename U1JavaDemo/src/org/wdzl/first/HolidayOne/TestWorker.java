package org.wdzl.first.HolidayOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestWorker {
    public static void main(String[] args) {
        String ID = "zhangwei";
        String password = "123456";
        String name;
        String key;
        int choice;
        boolean flag =false;
        List worktemp = new ArrayList();
        System.out.println("**********************");
        System.out.println("欢迎使用人事管理系统");
        Scanner input = new Scanner(System.in);
       do {

           System.out.print("请输入管理员账户：");
           name = input.next();
           System.out.print("请输入管理员密码：");
            key = input.next();
            if(key.equals(password)&&name.equals(ID))
            {
                System.out.println("登陆成功!");

                break;

            }
            else
            {
                System.out.println("输入错误! 请重新输入");
                flag = true;
            }
       }while(flag);
       do {
           System.out.println("**********************");
           System.out.println("欢迎使用人事管理系统");
           System.out.println("请选择:1.添加员工 2.查询全部 3.员工详细 4.退出系统");
            choice = input.nextInt();
           switch (choice)
           {
               case 1:
                   System.out.print("请输入员工编号：");
                   String wid = input.next();
                   System.out.print("请输入员工姓名：");
                   String wname = input.next();
                   System.out.print("请输入员工年龄：");
                   int  wage  = input.nextInt();
                   Worker wor = new Worker(wid,name,wage);
                   worktemp.add(wor);
                   System.out.println("添加成功! 按0返回 按其他任意键结束");
                   choice = input.nextInt();
                   break;
               case 2:
                   System.out.println("ID\t\t\t姓名\t\t\t\t\t年龄");
                   Iterator it = worktemp.iterator();
                   while(it.hasNext())
                   {
                       Object obj = it.next();
                       Worker wo = (Worker)obj;
                       System.out.println(wo.getId()+"\t\t\t"+wo.getName()+"\t\t\t"+wo.getAge());
                   }
                   System.out.println("按0返回 按其他任意键结束");
                   choice = input.nextInt();
                   break;
               case 3:
                   System.out.print("请选择你要查询员工的序号:");
                   String t = input.next();
                   for(int i = 0;i < worktemp.size();i++)
                   {

                       Worker a = (Worker)worktemp.get(i);
                       if(t.equals(a.getId()))
                       {
                           System.out.println("序号:"+a.getId());
                           System.out.println("姓名:"+a.getName());
                           System.out.println("年龄:"+a.getAge());
                           System.out.println("查找成功!按0返回 按其他任意键结束");
                           flag = true;
                           choice = input.nextInt();
                           break;
                       }
                   }
                   if(!flag)
                   {
                       System.out.println("查无此人!按0返回 按其他任意键结束");
                       choice = input.nextInt();
                       break;
                   }
                   break;
               case 4:
                   System.out.println("退出系统！");
                   choice = 1;
           }
       }while(choice == 0);
    }
}
