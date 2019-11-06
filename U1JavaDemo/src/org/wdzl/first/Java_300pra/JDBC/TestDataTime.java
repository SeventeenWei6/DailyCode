package org.wdzl.first.Java_300pra.JDBC;

import java.sql.*;
import java.util.Random;

public class TestDataTime {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","godwei666");
//            ps = con.prepareStatement("insert into temp_user values(?,?,?,?)");
//            ps.setObject(1,"1001");
//            ps.setObject(2,"王二");
//
//            Date date = new Date(System.currentTimeMillis());
//            ps.setDate(3,date);
//            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//            ps.setTimestamp(4,timestamp);
            for (int i = 0; i <1000 ; i++) {
                ps = con.prepareStatement("insert into temp_user values(?,?,?,?)");
                ps.setObject(1,i);
                ps.setObject(2,"张伟"+i);

                int rand = 100000000+new Random().nextInt(1000000000);
                java.sql.Date date = new Date(System.currentTimeMillis()-rand);
                Timestamp timestamp = new Timestamp(System.currentTimeMillis()-rand);

                ps.setDate(3,date);
                ps.setTimestamp(4,timestamp);
                ps.execute();
            }
            System.out.println("over");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
