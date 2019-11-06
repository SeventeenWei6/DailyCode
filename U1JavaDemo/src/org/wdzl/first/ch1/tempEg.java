package org.wdzl.first.ch1;

import java.util.Scanner;
import java.util.ArrayList;

public class tempEg {

    private String name;
    private boolean flag = true;
    private int time = 0;
    private int date;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setTime() {
        this.time = time + 1;
    }

    public String getName() {
        return name;
    }

    public boolean isFlag() {
        return flag;
    }

    public int getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }
}

class DvD {
    tempEg str[] = new tempEg[6];

    void add(int j) {
        System.out.println("请输入DVD名称:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        str[j].setName(s);
        System.out.println("新增<<" + s + ">>成功！");
    }

    void look() {
        for (int i = 0; i < str.length; i++) {
            System.out.println("DVD名称:" + str[i].getName() + " 是否可借:" + str[i].isFlag() + " 借出日期:" + str[i].getDate() + "号 借出次数:" + str[i].getTime());
        }

    }

    void Delete() {
        System.out.println("请输入你要删除的DVD序号(1号至6号):");
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        if (j > 6) {
            System.out.println("输入无效序号!");
            return;
        }
        if (j == 6) {
            str[j - 1] = null;
            System.out.println("删除成功!");
            return;
        }
        for (int i = j - 1; i < 5; i++) {
            str[i] = str[i + 1];
        }
        System.out.println("删除成功!");
    }

    void Loan() {
        System.out.println("请输入你要借出的DVD名称:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i].getName())) {
                if (str[i].isFlag()) {
                    System.out.println("请输入借出日期:");
                    int d = in.nextInt();

                    if (d > 31 || d < 1) {
                        System.out.println("输入无效日期");
                        return;
                    } else {
                        str[i].setDate(d);
                        str[i].setTime();
                        str[i].setFlag(false);
                        System.out.println("成功借出!!");
                        return;
                    }
                } else {
                    System.out.println("该DVD已借出！");
                    break;
                }
            }
        }
    }

    void Back() {
        System.out.println("请输入你要归还的DVD名称:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (true) {
            for (int i = 0; i < str.length; i++) {
                if (s.equals(str[i].getName())) {
                    if (!str[i].isFlag()) {
                        System.out.println("请输入归还日期:");
                        int d = in.nextInt();

                        if (d > 31 || d < 1) {
                            System.out.println("输入无效日期,重新输入");
                            continue;
                        } else {
                            double k = 0.5 * (d + 30 - str[i].getDate());
                            System.out.println("租金为: " + k);
                            return;
                        }
                    } else {
                        System.out.println("此DVD未借出，请重新输入");
                        continue;
                    }
                }
            }
            System.out.println("未找到此DVD，请重新输入");
        }
    }

    public static void main(String[] args) {
        int l;
        int i = 0;
        DvD temp = new DvD();
        for (int k = 0; k < 6; k++) {
            temp.str[k] = new tempEg();
        }
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎使用迷你DVD管理器");
            System.out.println("------------------");
            System.out.println("1.新增DVD");
            System.out.println("2.查看DVD");
            System.out.println("3.删除DVD");
            System.out.println("4.借出DVD");
            System.out.println("5.归还DVD");
            System.out.println("6.退出DVD");
            System.out.println("------------------");
            System.out.println("请选择:");
            l = input.nextInt();
            switch (l) {
                case 1:
                    System.out.println("-->新增DVD");
                    temp.add(i);
                    i++;
                    break;
                case 2:

                    temp.look();
                    break;
                case 3:
                    temp.Delete();
                    break;
                case 4:
                    temp.Loan();
                    break;
                case 5:
                    temp.Back();
                    break;
                case 6:
                    System.out.println("谢谢使用!");
                    return;
                default:
                    System.out.println("输入有误！！请重新输入");
                    break;
            }
            System.out.println("------------------");
        }
    }
}
