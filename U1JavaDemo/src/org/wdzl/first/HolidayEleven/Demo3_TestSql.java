package org.wdzl.first.HolidayEleven;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class Demo3_TestSql {
    private  String url;
    private String User;
    private  String Password;
    private String Driver;
    /*读取指定的文件并解析，取出键值对中数据赋给成员变量*/
    public void getParam(String filename) {
        Properties pro = new Properties();
        File file = new File(filename);
        try {
            FileInputStream fis = new FileInputStream(file);
            //加载输入流指定文件
            pro.load(fis);
            //获取文件中对应的值
            url = pro.getProperty("url");
            User = pro.getProperty("User");
            Password = pro.getProperty("Password");
            Driver = pro.getProperty("Driver");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //连接数据库，获取数据库中数据，并输出到控制台
    }
    public  void getData(){
        Connection con = null;
        Statement   st = null;
        ResultSet   rs = null;
        String sql = "select *from stu";
        try {
            Class.forName(Driver);
            con =  DriverManager.getConnection(url,User,Password);
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));

            }
            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo3_TestSql jdbc = new Demo3_TestSql();
        jdbc.getParam("src\\org\\wdzl\\first\\HolidayEleven\\mysql.properties");
        jdbc.getData();
    }


}
