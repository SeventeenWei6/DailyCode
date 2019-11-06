package org.wdzl.first.HolidayEleven;

import java.sql.*;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       String url = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?serverTimezone=UTC","root","godwei666.");
        PreparedStatement ps;
        ResultSet rs;

        String  sql = "select *from stu where sname like '%王%' or ssex like'%男%'";
        ps = con.prepareStatement(sql);

        rs = ps.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+rs.getString(5));
        }

        rs.close();
    }
}
