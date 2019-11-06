package org.wdzl.first.DemoNewFirst;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo_1_TestReflict {
    public static void main(String[] args)throws Exception {
        Class stu3 = Class.forName("org.wdzl.first.DemoNewFirst.Demo_1_Student");
//        Constructor []con1  = stu3.getConstructors();
//        for (Constructor con:con1
//             ) {
//            System.out.println(con);
//        }
//        Method [] methods1 = stu3.getMethods();
//        for (Method m:methods1
//             ) {
//            System.out.println(m);
//        }
//        Field []fields1 = stu3.getFields();
//        for (Field field:fields1
//             ) {
//            System.out.println(field);
//        }

        Constructor con = stu3.getDeclaredConstructor(String.class,int.class);
        con.setAccessible(true);
        Object obj = con.newInstance("sdasda",5);
        Method method = stu3.getDeclaredMethod("show");
        method.setAccessible(true);
        method.invoke(obj);
        Field field = stu3.getDeclaredField("age");
        field.setAccessible(true);
        field.set(obj,19);
        System.out.println(obj);
       // System.out.println(obj);
    }
}
