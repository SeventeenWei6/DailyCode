package org.wdzl.first.ch2;

import java.util.Scanner;

public class StudentTest {

    public void setScore(Student stus[])
    {
        Scanner input = new Scanner(System.in);

        for(int i = 0;i < stus.length;i++)
        {

            int k = input.nextInt();
            stus[i].setScore(k);

        }
    }
    public int pingJun(Student stus[])
    {
        int sum = 0;
        for(int i = 0;i < stus.length;i++)
        {
            sum += stus[i].getScore();
        }
        System.out.println("平均成绩:");
        return sum/5;
    }
    public int maxScore(Student stus[])
    {
        int temp;
        for(int i = 0;i < stus.length;i++)
        {
            for(int j = 0 ;j < stus.length-1-i;j++)
            {
                 if(stus[j].score < stus[j+1].score)
                 {
                     temp = stus[j].score;
                     stus[j].score = stus[j+1].getScore();
                     stus[j+1].score = temp;
                 }
            }
        }
        System.out.println("最高成绩");
        return stus[0].score;
    }
    public static void main(String[] args) {
        StudentTest temp = new StudentTest();
        Student stus[] = new Student[5];
        for(int i = 0;i < stus.length;i++)
        {
            stus[i] = new Student();
        }
        System.out.println("请输入五名参赛者信息");
        temp.setScore(stus);
        System.out.println(temp.pingJun(stus));
        System.out.println(temp.maxScore(stus));

    }
}
