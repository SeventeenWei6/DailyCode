package org.wdzl.first.Java_300pra.JDBC;

import java.io.*;
import java.sql.*;

public class JDBC_Demo4 {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","godwei666");
//            ps = con.prepareStatement("insert into temp_user (username,txt) values (?,?)");
//            ps.setObject(1,"1002");
//            ps.setClob(2,new FileReader(new File("D:\\a.txt")));
//            ps.setClob( 2,new BufferedReader(new InputStreamReader(new ByteArrayInputStream("dasdasdasda".getBytes()))));
//            ps.executeUpdate();


            ps = con.prepareStatement("select  *from temp_user where username = ?");
            ps.setObject(1,1001);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Clob clob = rs.getClob("txt");
                Reader r = clob.getCharacterStream();
                int temp = 0;
                while((temp = r.read())!=-1)
                {
                    System.out.print((char)temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
