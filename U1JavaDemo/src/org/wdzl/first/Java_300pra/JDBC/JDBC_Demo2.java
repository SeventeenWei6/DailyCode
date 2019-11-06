package org.wdzl.first.Java_300pra.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = null;
        Statement sta = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","godwei666");
            con.setAutoCommit(false);
            sta = con.createStatement();
            for (int i = 0; i <2000 ; i++) {
                sta.addBatch("insert into temp_user values('zhang"+i+"','123456',now())");
            }
            sta.executeBatch();

            sta.execute("insert into temp_user values ('aaa',123)");

            con.commit();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
