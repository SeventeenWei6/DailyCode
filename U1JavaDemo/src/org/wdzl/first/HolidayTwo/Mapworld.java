package org.wdzl.first.HolidayTwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapworld {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("中国","China");
        map.put("美国","American");
        map.put("日本","Japan");
        System.out.println("Map中共有"+map.size()+"组数据");
        System.out.println("中国 所对应英文是 "+map.get("中国"));
        Set<String> temp = map.keySet();
        Iterator<String> it = temp.iterator();
        while(it.hasNext())
        {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+": "+value);
        }
//        for (String key:map.keySet()) {
//            String value = map.get(key);
//            System.out.println(key+": "+value);
//
//        }
        System.out.println(map.containsKey("中国"));
    }
}
