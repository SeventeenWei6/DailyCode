package org.wdzl.first.Java_300pra.JDBC;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JDBC_Demo3 {

    public  static  long ChangeDate(String datestr)
    {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return  format.parse(datestr).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }

    }
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","godwei666");
            ps = con.prepareStatement("select * from temp_user where lastLoginTime > ? and lastLoginTime < ? order  by lastLoginTime");

            Timestamp start = new Timestamp(ChangeDate("2019-10-01 09:09:00"));
            Timestamp end = new Timestamp(ChangeDate("2019-10-02 08:08:00"));



            ps.setObject(1,start);
            ps.setObject(2,end);
            ResultSet set = ps.executeQuery();
            while(set.next())
            {
                System.out.println(set.getString("userid")+"--"+set.getString("username")+"--"+set.getDate("user_Time")+"--"+set.getTimestamp("lastLoginTime"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
