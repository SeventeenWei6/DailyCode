package org.wdzl.first.Java_300pra.OldTest;

import java.util.*;

public class TestSet {
    HashMap map;
    String name;
    private static  final Object PRESENT = new Object();
    public TestSet(){
        map = new HashMap();
    }
    public  int  size()
    {
        return map.size();
    }
    public void add(Object o){
        map.put(o,PRESENT);
    }

    public static void main(String[] args) {
//        TestSet s = new TestSet();
//        s.add("aaa");
//        System.out.println(s.toString());
//        Map<String,String> a = new HashMap();
//        a.put("AAA","BBB");
//        a.put("AAA","BBB");
//        Set<String> set = a.keySet();
//        Iterator <String> iterator = set.iterator();
//        while (iterator.hasNext())
//        {
//            String key = iterator.next();
//            System.out.println(key+" "+a.get(key));
//        }

        Map<String,String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        System.out.println("输出为:");
        for (String key:
             map.keySet()) {
            System.out.println(key+"" +map.get(key));

        }

    }
}
