package org.wdzl.first.Java_300pra.UserForJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUser {
    static UserFinish userFinish = new UserFinish();
    public static  void Entrance()
    {
        Scanner input = new Scanner(System.in);
        String name = null;
        String pwd = null;
        int key = 0;
        String s = null;
        int temp = 0;
        while(true)
        {
            System.out.println("欢迎使用数据库:");
            System.out.println("1:如果是新用户请注册 输入1:");
            System.out.println("2:登录 请输入2:");
            try {
                key = input.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("请输入数字!!!");
                s = input.nextLine();
                continue;
            }
            switch (key)
            {
                case 1:
                    System.out.print("请输入用户名:");
                    name = input.next();
                    System.out.println("请输入密码：");
                    pwd = input.next();
                    User user = new User(name,pwd);
                    temp = register(user);
                    if(temp!=1)
                    {
                        break;
                    }
                    else {
                        return;
                    }
                case 2:
                    System.out.print("请输入用户名:");
                    name = input.next();
                    System.out.print("请输入密码：");
                    pwd = input.next();
                    temp = login(name,pwd);
                    if(temp!=1)
                    {
                        break;
                    }
                    else {
                        return;
                    }
                default:
                    System.out.println("请输入正确数字");
                    break;
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
                    rs = JdbcUtils.exeSelect(sql, object);
                    System.out.println("Id        Name     Pwd");
                    while (rs.next()) {

                            System.out.println(rs.getInt("id")+"        " +rs.getString("name") + "        "  + rs.getString("pwd"));
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
                    JdbcUtils.exeUpdate(sql, object);
                    return;
                default:
                    System.out.println("请输入正确数字！");
                    break;
            }
        }
    }


    public  static  int register(User user)
    {
        boolean res = userFinish.addUser(user);
        if(res)
        {
            System.out.println("用户注册成功");
            return 1;
        }
        else
        {
            System.out.println("用户注册失败");
            return 0;
        }
    }
    public  static  int login(String name,String pwd)
    {
        User user = userFinish.LoginUser(name);
        if(user!=null)
        {
            if(user.getPwd().equals(pwd))
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
