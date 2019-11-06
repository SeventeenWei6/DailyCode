package Datasouce.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Demo1 {
    public static void main(String[] args) {
//        //创建数据源对象  获取配置文件中的默认数据源
//        DataSource dataSource = new ComboPooledDataSource();
//        //获取连接
//        try {
//
//            for (int i = 1; i <=11 ; i++) {
//                Connection con = dataSource.getConnection();
//                System.out.println(con);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        //获取指定名称的数据源
        DataSource dataSource = new ComboPooledDataSource("otherc3p0");
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
