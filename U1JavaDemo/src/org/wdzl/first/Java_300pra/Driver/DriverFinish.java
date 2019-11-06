package org.wdzl.first.Java_300pra.Driver;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverFinish implements InterfaceforDriver {



    @Override
    public Person LoginPerson(String name) {
        Person person = null;
        String sql = "select *from driver where Dname = ?";
        Object []object = {name};
        ResultSet rs = DriverUtils.exeSelect(sql,object);
        try {
            if(rs.next())
            {

                person = new Person( rs.getInt("Did"),
                        rs.getString("Dname"),
                        rs.getInt("Did"),
                        rs.getString("Dsex"),
                        rs.getString("Dadd"),
                        rs.getInt("Dphone"),
                        rs.getString("Dsize"),
                        rs.getInt("Dtime"),
                        rs.getString("Dpwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DriverUtils.closeAll();
        }
        return person;
    }
}
