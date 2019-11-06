package org.wdzl.first.Java_300pra.JDBC;

import java.sql.*;

public class Test_JDBC {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/Mrzhang?serverTimezone=UTC";
        Connection con = null;
        PreparedStatement ps = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","godwei666");

//            Statement statement =  con.createStatement();
//            String sql = "insert  into student VALUES(1007,'李某',22,'男')";
//            statement.execute(sql);
            String sql = "delete from student where sid = ?";//? 占位符
            String sql2 = "select *from student where sid>?";
            String sql3 = "insert  into student VALUES(?,?,?,?)";
//            ps = con.prepareStatement(sql2);
//            ps.setString(1,"1001");
//            ResultSet set = ps.executeQuery();
//            while(set.next())
//            {
//                System.out.println(set.getString(1)+" "+set.getString(2)+" "+set.getInt(3));
//            }
            ps = con.prepareStatement(sql);
            ps.setObject(1,1007);
            ps.executeUpdate();
//            ps = con.prepareStatement(sql3);
//            ps.setObject(1,"1008");
//            ps.setObject(2,"李安");
//            ps.setObject(3,24);
//            ps.setObject(4,"男");
//            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(ps!=null){
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
