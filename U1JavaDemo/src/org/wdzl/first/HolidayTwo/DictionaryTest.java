package org.wdzl.first.HolidayTwo;

import java.util.*;

public class DictionaryTest
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int choice;
        int key =0;
        Map<String,String>  dict = new HashMap<String,String>();
        do {

            System.out.println("******************************");
            System.out.println("欢迎使用英语词典系统");
            System.out.println("1.查询单词");
            System.out.println("2.添加词库");
            System.out.println("3.退出系统");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("请输入你要查询的单词");
                    String temp = input.next();
                    Set<String> p = dict.keySet();
                    Iterator<String> it = p.iterator();
                    while(it.hasNext())
                    {
                        String k = it.next();
                        if(k.equals(temp))
                        {
                            String value = dict.get(k);
                            System.out.println(temp+"中文翻译为:"+value);
                            flag = true;
                            System.out.println("查找成功，按0返回!");
                            key = input.nextInt();
                            break;
                        }
                    }
                    if(!flag)
                    {
                        System.out.println("对不起，没有查到该单词!");
                        key = input.nextInt();
                        break;
                    }
                    break;
                case 2:
                    System.out.print("请输入要添加的单词:");
                    String t = input.next();
                    System.out.print("新增单词的中文意思:");
                    String c = input.next();
                    dict.put(t,c);
                    System.out.println("添加成功！按0返回");
                    key = input.nextInt();
                    break;
                default:
                    break;
            }
        }while(key == 0);

    }
}
