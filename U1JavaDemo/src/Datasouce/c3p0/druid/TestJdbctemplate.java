package Datasouce.c3p0.druid;

import Datasouce.c3p0.JdbcUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class TestJdbctemplate {
     JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
     @Test
     public void test1(){
         String sql = "update student set age = 21 where sid = 1003";
         int count = template.update(sql);
         System.out.println(count);

     }
     @Test
    public void test2(){
         String sql = "insert into student(sid,sname,age,sex) values(?,?,?,?)";
         int count = template.update(sql,1011,"雷宽",20,"男");
         System.out.println(count);
     }
     @Test
    public void test3(){
         String sql = "delete from student where id = ?";
         int count = template.update(sql,1011);
         System.out.println(count);

     }
     @Test
    public void test4()
     {
         String sql = "select *from student where id = ?";
         Map<String,Object> maps = template.queryForMap(sql,1001);
         System.out.println(maps);
     }
     @Test
    public void test5()
     {
         String sql = "select *from student";
         List<Map<String,Object>> list = template.queryForList(sql);
         for (Map<String, Object> stringObjectMap : list) {
             System.out.println(stringObjectMap);
         }
     }
     @Test
     public void test6()
     {
         String sql= "select count(sid) from student";
        Long total = template.queryForObject(sql,Long.class);
         System.out.println(total);
     }
}
