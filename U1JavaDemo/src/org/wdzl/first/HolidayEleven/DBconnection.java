package org.wdzl.first.HolidayEleven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public Connection getConn() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
        Connection con = null;
        Class.forName(driver);
        con = DriverManager.getConnection(url, "root", "godwei666.");
        return con;

    }
}
