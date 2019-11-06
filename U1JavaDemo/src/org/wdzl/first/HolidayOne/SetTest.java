package org.wdzl.first.HolidayOne;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set temp =  new HashSet();
        temp.add("lisi");
        temp.add("zhangmou");
        temp.add("lisi");
        Iterator it = temp.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
//        for (Object obj:temp) {
//            Set o = (Set) obj;
//            System.out.println(o.);
//
//        }
    }
}
