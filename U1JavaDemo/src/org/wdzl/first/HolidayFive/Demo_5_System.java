package org.wdzl.first.HolidayFive;

import java.io.*;

public class Demo_5_System {
    public static void main (String[] args)throws IOException {
//        OutputStream out =System.out;
//        String str = "zhangsan";
//        out.write(str.getBytes());
//        out.close();
//
        //计算器的加法运算
        int a = 0;
        int b = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入第一个数字:");
        String str = br.readLine();
         a  = Integer.parseInt(str);
        System.out.println("请输入第二个数:");
        str = br.readLine();
        b = Integer.parseInt(str);
        System.out.println();
    }

}
