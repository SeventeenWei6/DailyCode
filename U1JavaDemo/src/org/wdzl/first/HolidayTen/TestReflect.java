package org.wdzl.first.HolidayTen;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class TestReflect {
    public TestReflect(D1_TempPerson P) {
//        String str = JOptionPane.showInputDialog("请输入路径","null");

//        Class cla = P.getClass();//第一种
        Class cla = D1_TempPerson.class;//第二种
//        Class cla = Class.forName("org.wdzl.first.HolidayTen.D1_TempPerson");//第三种
        Method[] method = cla.getDeclaredMethods();
        Constructor []con = cla.getConstructors();
        Field []arr = cla.getDeclaredFields();
        System.out.println("***方法***");
//        for (Method m : method
//        ) {
//            System.out.println(m.toString());
//        }
        for(Field a:arr)
        {
            System.out.println(a.toString());
        }
//        for(Constructor c:con)
//        {
//            System.out.println(c);
//        }


    }
    public static void main(String[] args) {
        TestReflect temp = new TestReflect(new D1_TempPerson("123",12));

    }
}
