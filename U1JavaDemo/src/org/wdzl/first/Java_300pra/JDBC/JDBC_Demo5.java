package org.wdzl.first.Java_300pra.JDBC;

import java.io.*;
import java.sql.*;

public class JDBC_Demo5  {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = null;
        PreparedStatement ps = null;
        InputStream  is = null;
        OutputStream os =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","godwei666");


//            ps  = con.prepareStatement("insert  into  temp_user (username,headImg) values (?,?)");
//            ps.setObject(1,"1003");
//            ps.setBlob(2,new FileInputStream("F:\\13.jpg"));
//            ps.execute(); // BLOB插入数据

            ps = con.prepareStatement("select  * from temp_user where username = ?");
            ps.setObject(1,"1003");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Blob b = rs.getBlob("headImg");
                is = b.getBinaryStream(); //转化成 二进制 输入流
                os = new FileOutputStream("F:\\a.jpg");
                int temp = 0;
                while((temp = is.read())!=-1)
                {
                    os.write(temp);
                }
            }
        } catch (Exception e) {

            e.printStackTrace();
        }finally {
            if(is!=null)
            {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ps!=null )
            {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con!=null)
            {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
