package org.wdzl.first.Java_300pra.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_demo1013 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(url, "root", "godwei666");
        String sql = "update account set balance = 1000 where id = 1";
        String sql1 = "insert into account values(3,'jame',1200)";
        String sql2 = "delete from account where id = 3";
        Statement sta = con.createStatement();
        sta.executeUpdate(sql2);
        sta.close();
        con.close();
    }
}