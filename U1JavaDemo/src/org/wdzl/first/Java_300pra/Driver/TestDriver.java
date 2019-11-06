package org.wdzl.first.Java_300pra.Driver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDriver {
    static DriverFinish driverFinish = new DriverFinish();

    public static  void Entrance() {
        Scanner input = new Scanner(System.in);
        String name = null;
        String pwd = null;
        int key = 0;
        String s = null;
        int temp = 0;
        while (true) {
            System.out.println("欢迎使用数据库:");
            System.out.println("请登录^.^");

            System.out.print("请输入用户名:");
            name = input.next();
            System.out.print("请输入密码：");
            pwd = input.next();
            Person person = new Person(name, pwd);
            temp = login(name, pwd);
            if (temp == 1) {
                return;
            }

        }
    }
    public static  void menu() throws SQLException {
        Scanner input = new Scanner(System.in);
        int key = 0;
        String s = null;
        String sql = null;
        String name = null;
        ResultSet rs = null;
        Object []object = null;
        int index = 0;
        while (true) {
            System.out.println("请选择功能:");
            System.out.println("1.列表查询");
            System.out.println("2.删除/修改/增加操作");
            try {
                key = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("请输入数字!!!");
                s = input.nextLine();
                continue;
            }
            s = input.nextLine();
            switch (key) {
                case 1:
                    System.out.print("请输入sql语句:");
                    sql = input.nextLine();
                    System.out.print("请输入通配符个数:");
                    index = input.nextInt();
                    s = input.nextLine();
                    object = new Object[index];
                    if(index != 0)
                    {

                        System.out.println("请输入通配符中内容:");
                        for (int i = 0; i < index; i++) {
                            object[i] = input.nextLine();
                        }
                    }
                    rs = DriverUtils.exeSelect(sql, object);
                    System.out.println("Did\t\tDname\t\tDidnumber\t\tDsex\t\tDadd\t\tDphone\t\tDsize\t\tDtime\t\tDpwd");
                    while (rs.next()) {

                        System.out.println(rs.getInt("Did")+"\t"+
                                rs.getString("Dname")+"\t\t"+
                                rs.getInt("Didnumber")+"\t\t"+
                                rs.getString("Dsex")+"\t\t\t"+
                                rs.getString("Dadd")+"\t\t\t"+
                                rs.getInt("Dphone")+"\t"+
                                rs.getString("Dsize")+"\t\t\t"+
                                rs.getInt("Dtime")+"\t\t\t"+
                                rs.getString("Dpwd"));
                    }
                    return;
                case 2:
                    System.out.print("请输入sql语句:");
                    sql = input.nextLine();
                    System.out.print("请输入通配符个数:");
                    index = input.nextInt();
                    s = input.nextLine();
                    object = new Object[index];
                    if(index != 0)
                    {
                        System.out.println("请输入通配符中内容:");
                        for (int i = 0; i < index; i++) {
                            object[i] = input.nextLine();
                        }
                    }
                    DriverUtils.exeUpdate(sql, object);
                    return;
                default:
                    System.out.println("请输入正确数字！");
                    break;
            }
        }
    }
    public  static  int login(String name,String pwd)
    {
        Person person = driverFinish.LoginPerson(name);
        if(person!=null)
        {
            if(person.getDpwd().equals(pwd))
            {
                System.out.println("登录成功");
                return 1;
            }
            else {
                System.out.println("登录失败");
                return 0;
            }
        }
        else {
            System.out.println("用户不存在");
            return 0;
        }

    }
    public static void main(String[] args) {
        //程序入口
        Entrance();

        //功能选项
        try {
            menu();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
