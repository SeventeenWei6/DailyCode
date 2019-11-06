package org.wdzl.first.HolidayEleven;

import java.sql.*;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("******欢迎使用数据库******");
        System.out.println("1.添加数据");
        System.out.println("2.删除数据");
        System.out.println("3.修改数据");
        System.out.println("4.查看数据");
        System.out.println("5.退出");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的选择:");
        int key = input.nextInt();
        switch (key)
        {
            case 1:
                System.out.print("请输入姓名:");
                String name = input.next();
                System.out.print("请输入年龄:");
                int age = input.nextInt();
                System.out.print("请输入籍贯:");
                String addr = input.next();
                add(name,age,addr);
                break;
            case 2:
                System.out.print("请输入姓名:");
                String nname = input.next();
                delete(nname);
                break;
            case 3:
                update();
                break;
            case 4 :
                look();
                break;
            case 5:
                break;
        }
    }

    public static void add(String nname,int age,String addr) throws SQLException, ClassNotFoundException {
        DBconnection DB =new DBconnection();
        String sql ="insert into student (name,age,addr) values (?,?,?)";
        PreparedStatement ps = DB.getConn().prepareStatement(sql);
        ps.setString(1,nname);
        ps.setInt(2,age);
        ps.setString(3,addr);
        ps.executeUpdate();
        ps.close();
        System.out.println("添加成功!");
    }
    public static void delete(String nname) throws SQLException, ClassNotFoundException {
        DBconnection DB =new DBconnection();
        String sql = "delete from student where name = nname";
        PreparedStatement ps = DB.getConn().prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        System.out.println("删除成功!");
    }
    public static void update() throws SQLException, ClassNotFoundException {
        DBconnection DB =new DBconnection();
        Scanner in = new Scanner(System.in);
        String nname;
        String addrr;
        System.out.print("请输入你要修改的同学名字");
        nname = in.next();
        System.out.print("请输入要修改的地址");
        addrr = in.next();
        String sql = "update student set addr = addrr where name = nname";
        PreparedStatement ps = DB.getConn().prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        System.out.println("修改成功!");
    }
    public static  void look() throws SQLException, ClassNotFoundException {
        DBconnection DB =new DBconnection();
        String sql = "select *from student ";
        PreparedStatement stm = DB.getConn().prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getString("name")+"\t\t"+rs.getInt("age")+"\t\t"+rs.getString("addr"));

        }
    }
}
