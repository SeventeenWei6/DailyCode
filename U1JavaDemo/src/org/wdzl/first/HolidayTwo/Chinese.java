package org.wdzl.first.HolidayTwo;

import java.util.*;

public class Chinese {
    public static void main(String[] args) {
        //Map<String,String> ch = new HashMap<String, String>();
        List<String> temp = new ArrayList<String>();
        temp.add("ZhangSan");
        temp.add("LiSi");
        temp.add("WangMazi");
        temp.add("ZhaoYun");
        Collections.sort(temp);
        System.out.println(temp);
    }
}
