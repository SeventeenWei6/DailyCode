package org.wdzl.first.ch10;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ExceptionOne {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public   void dothing() throws Exception {
        if (this.getAge() > 100 || this.getAge() < 1)
        {
            throw new Exception("输入年龄错误");
        }
        else
        {
            System.out.println(this.getAge());
        }
    }
//    public static  void test() {
//        String V[] = {"C++", "Java", "C"};
//        int x;
//        do {
//            System.out.print("请输入课程代号(1~3)之间的数字：");
//            Scanner input = new Scanner(System.in);
//            x = input.nextInt();
//            try {
//                System.out.print(V[x]);
//                return;
//            } catch (Exception a) {
//                System.out.println("输入错误");
//                x = 1;
//            }
//            finally {
//                System.out.println("欢迎提出建议");
//            }
//        } while (x > 0 && x < 3);
//
//    }

    public static void main(String[] args) {
        ExceptionOne test = new ExceptionOne();
        test.setAge(50);
        try {
          test.dothing();
         }
      catch(Exception a)
        {
            //System.out.println(1/1);
            System.err.println(a.getMessage());
        }
    }
}
