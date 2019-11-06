package org.wdzl.first.HolidayEleven;

import java.sql.*;

public class Demo04_TestShiwu {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
        String Driver = "com.mysql.cj.jdbc.Driver";
        String User = "root";
        String Password = "godwei666.";
        Class.forName(Driver);
        Connection con = DriverManager.getConnection(url,User,Password);
//        con.setAutoCommit(false);//取消自动提交事务
//        Statement st =con.createStatement();
//        st.addBatch("insert into dept(dname) value ('lalalalal') ");
//        st.addBatch("insert into dept(dname) value ('lalalal') ");
//        st.addBatch("insert into dep(dname) value ('vavaalalal') ");
//        st.addBatch("insert into dept(dname) value ('laldasdaalalal') ");
//        int []temp = st.executeBatch();
//        con.commit();
//        con.rollback();
        DatabaseMetaData dmd = con.getMetaData();
        System.out.println(dmd.getDatabaseMajorVersion());
        ResultSet rs = dmd.getPrimaryKeys(null,null,"stu");
        while(rs.next())
        {
            System.out.println(rs.getString(1));

        }
        con.close();
    }
}
