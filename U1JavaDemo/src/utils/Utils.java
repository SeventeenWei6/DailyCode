package utils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;
import Datasouce.c3p0.druid.druidDemo1;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.io.*;

public class Utils {

    private static Connection con;
    private static PreparedStatement pps;
    private static ResultSet rs;
    private static DataSource ds;

    static {
        //创建properties类的对象，用于后面获取properties文件中的信息
        Properties pro = new Properties();
        try {
            InputStream is = druidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            //获得数据源(数据库)
            ds = DruidDataSourceFactory.createDataSource(pro);

//
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //获取连接
    public static Connection getCon() {
        try {
            con = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    //公共的增删改方法
    public static int exeUpdate(String sql, Object[] params) {
        //insert into emp values(?,?);
        //update emp set name = ? where id = ? and age = ?
        //获取连接
        con = getCon();
        int row = 0;
        try {
            pps = con.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    pps.setObject(i + 1, params[i]);
                }
            }
            row = pps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
    //公共的查询方法
    public static ResultSet exeSelect(String sql,Object[] params){

        con = getCon();
        try {
            pps = con.prepareStatement(sql);
            if(params!=null) {
                for (int i = 0; i < params.length; i++) {
                    pps.setObject(i + 1, params[i]);
                }
            }
            rs = pps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public static void closeAll(){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pps!=null){
            try {
                pps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

