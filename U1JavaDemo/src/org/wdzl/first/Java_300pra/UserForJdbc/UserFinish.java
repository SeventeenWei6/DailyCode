package org.wdzl.first.Java_300pra.UserForJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
* User用户实现类
* */
public class UserFinish implements InterfaceforUser {

    //
    @Override
    public User LoginUser(String name) {
        User user = null;
        String sql = "select *from user where name = ?";
        Object []object = {name};
        ResultSet rs = JdbcUtils.exeSelect(sql,object);
        try {
            if(rs.next())
            {
                user = new User(
                        rs.getString("Dname"),
                        rs.getString("Dpwd"),
                        rs.getInt("Did"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            {
                JdbcUtils.closeAll();
            }
        }
        return user;
    }
    //注册
    @Override
    public boolean addUser(User user) {
        String sql = "insert into user(name,pwd) values(?,?)";
        Object[] obj = {user.getName(),user.getPwd()};
        int row  = JdbcUtils.exeUpdate(sql,obj);
        JdbcUtils.closeAll();
        return row>0?true:false;
    }

}
