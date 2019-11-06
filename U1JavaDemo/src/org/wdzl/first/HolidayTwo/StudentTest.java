package org.wdzl.first.HolidayTwo;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<String> temp = new ArrayList<String>();
        temp.add("abcdefghj");
        temp.add("acddse");
        temp.add("abcdf");
        String Max = Collections.max(temp);
        String Min = Collections.min(temp);
        System.out.println(Max+" "+Min);
        Collections.sort(temp);
        System.out.println(temp);
//        Collections.sort(temp,Collections.reverseOrder());
        System.out.println(temp);
    }
}
