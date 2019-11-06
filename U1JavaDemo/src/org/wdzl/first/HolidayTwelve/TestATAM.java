package org.wdzl.first.HolidayTwelve;

import org.wdzl.first.HolidayEleven.DBconnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestATAM {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String id =null;
        String nid;
        String password = null;
        Scanner input = new Scanner(System.in);
        int key = 0;
        int k  =0;
        int c = 0;
      while(k<3) {
          System.out.print("请输入卡号:");
          id = input.nextLine();
          System.out.print("请输入密码:");
          password = input.nextLine();
          key =Denglu(id, password);
          if(key == 1) {
              k = 0;
              while (true) {
                  System.out.println("请选择你的操作");
                  System.out.println("1.查询余额");
                  System.out.println("2.取款");
                  System.out.println("3.修改密码");
                  System.out.println("4.存钱");
                  System.out.println("5.退卡");
                  System.out.print("请输入你的选择:");
                  c = input.nextInt();
                  switch (c)
                  {
                      case 1:
                          look(id);
                          break;
                      case 2:
                          getMoney(id);
                          break;
                      case 3:
                          updatePassword(id);
                          break;
                      case 4:
                          saveMoney(id);
                          break;
                      case 5:
                          System.out.println("退卡成功!");
                          return;
                  }

              }
          }
          else
          {
              k++;
              continue;
          }
      }
    }


    public  static int Denglu(String id, String password) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        String Pid = null;
        String Password = null;
        DBcount  db = new DBcount();
        String sql = "select *from personcount ";
        PreparedStatement stm = db.getConn().prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            Pid = rs.getString("Pid");
           Password = rs.getString("Password");
           if(Pid.equals(id) && Password.equals(password))
           {
               flag = true;
               break;
           }
        }
        rs.close();
        stm.close();
        if(flag)
        {
            System.out.println("登录成功!");
            return 1;
        }
        else
        {
            System.out.println("用户名或密码错误请重新登录!总共只有三次机会");
            return 0;
        }
    }
    public  static  void look(String id) throws SQLException, ClassNotFoundException {
        int money = 0;
        System.out.println(id);
        DBcount  db = new DBcount();
        String sql = "select *from personcount ";
        PreparedStatement stm = db.getConn().prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            if(rs.getString("Pid").equals(id))
            {
                money = rs.getInt("Pmoney");
                System.out.println("账户余额:"+money);
            }
        }
        rs.close();
        stm.close();

    }
    public  static  void getMoney(String id) throws SQLException, ClassNotFoundException {
        int money;
        DBcount  db = new DBcount();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的取款金额:");
        money = in.nextInt();
        String sql = "update personcount set Pmoney = Pmoney-? where Pid =?";
        PreparedStatement ps = db.getConn().prepareStatement(sql);
        ps.setInt(1,money);
        ps.setString(2,id);
        ps.executeUpdate();
        System.out.println("取钱成功!");
        ps.close();
    }
    public  static  void updatePassword(String id) throws SQLException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        String newPassword;
        String newpassword;
        boolean flag = false;
        System.out.print("请输入新密码:");
        newPassword = in.nextLine();
        while(!flag)
        {

            System.out.println("请再次输入新密码:");
            newpassword = in.nextLine();
            if(!newPassword.equals(newpassword))
            {
                System.out.println("两次输入不一致，请重新输入");
                System.out.print("请输入新密码:");
                newPassword = in.nextLine();
            }
            else
            {
                flag =true;
            }
        }
        DBcount  db = new DBcount();
        String sql = "update personcount set Password = ? where Pid = ?";
        PreparedStatement ps = db.getConn().prepareStatement(sql);
        ps.setString(1,newPassword);
        ps.setString(2,id);
        ps.executeUpdate();
        System.out.println("修改成功！");
        ps.close();
    }
    public  static void  saveMoney(String id) throws SQLException, ClassNotFoundException {
        int money;
        DBcount  db = new DBcount();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的存款金额:");
        money = in.nextInt();
        String sql = "update personcount set Pmoney = Pmoney+? where Pid = "+id+"";
        PreparedStatement ps = db.getConn().prepareStatement(sql);
        ps.setInt(1,money);
       // ps.setString(2,id);
        ps.executeUpdate();
        System.out.println("存钱成功!");
        ps.close();
    }
}
