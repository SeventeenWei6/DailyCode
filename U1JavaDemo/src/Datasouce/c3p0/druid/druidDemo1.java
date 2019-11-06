package Datasouce.c3p0.druid;





import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druidDemo1 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        InputStream is = druidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");

        try {
            pro.load(is);
            DataSource ds = new DruidDataSourceFactory().createDataSource(pro);
            Connection con = ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
