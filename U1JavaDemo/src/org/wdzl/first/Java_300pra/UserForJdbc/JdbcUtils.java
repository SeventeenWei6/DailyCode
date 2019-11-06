package org.wdzl.first.Java_300pra.UserForJdbc;

import Datasouce.c3p0.druid.druidDemo1;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String jdbc_url;
    private static String jdbc_user;
    private static String jdbc_pwd;
    private static Connection con;
    private static PreparedStatement pps;
    private static ResultSet rs;
    private static  DataSource ds;

    static {
        //创建properties类的对象，用于后面获取properties文件中的信息
        Properties pro = new Properties();
        //类加载器
        //ClassLoader loader = JdbcUtils.class.getClassLoader();
        //获得配置文件url
       // URL url = loader.getResource("src\\org\\wdzl\\first\\Java_300pra\\UserForJdbc\\jdbc.properties");
        //得文件路径
       // String path = url.getPath();
        try {
            //InputStream is = druidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
            FileInputStream fis = new FileInputStream("src\\org\\wdzl\\first\\Java_300pra\\UserForJdbc\\jdbc.properties");
            pro.load(fis);
           // DataSource ds = DruidDataSourceFactory.createDataSource(pro);

//            jdbc_url = pro.getProperty("jdbc_url");
//            jdbc_user = pro.getProperty("jdbc_user");
//            jdbc_pwd = pro.getProperty("jdbc_pwd");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //从提取url,name,pwd

    }

    //获取连接
    public static Connection getCon() {
        try {
            //con = ds.getConnection();
            con = DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_pwd);
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

