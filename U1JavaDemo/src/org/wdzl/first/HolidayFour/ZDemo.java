package org.wdzl.first.HolidayFour;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.wdzl.first.ch7.Pat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZDemo {
    public static void main(String[] args) {
//        String str = "2015-03-16";
//        String pat = "\\d{4}-\\d{2}-\\d{2}";
//        Pattern p = Pattern.compile(pat);
//        Matcher m = p.matcher(str);
//        if(m.matches())
//        {
//            System.out.println("格式正确");
//        }
//        else
//        {
//            System.out.println("格式不正确");
//        }
        //拆分字符串(使用正则表达式)
//        String str = "a1b22c333d4444e55555f";
//        String pat = "\\d+";
////        Pattern p = Pattern.compile(pat);
////        String s[] = p.split(str);
//        Pattern p = Pattern.compile(pat);
//        Matcher m = p.matcher(str);
//        String newStr = m.replaceAll("_");
//        System.out.println(newStr);

        Scanner input = new Scanner(System.in);
        String str = input.next();
        for (int i = 0; i < str.length();i++)
        {
            if(i%2==0)
            {
                System.out.print(str.charAt(i));
            }
            else
            {
                char c = Character.toUpperCase(str.charAt(i));
                System.out.print(c);
            }

        }



    }
}
