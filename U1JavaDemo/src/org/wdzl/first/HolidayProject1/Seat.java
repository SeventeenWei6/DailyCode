package org.wdzl.first.HolidayProject1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Seat {
    List<String> list = new ArrayList<>();
    public List seaT()
    {
        list.add(0,"true");
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=7 ; j++) {
                list.add(i*j,"true");
            }
        }
        return list;
    }
}
//class Test
//{
//    public static void main(String[] args) {
//        Seat seat = new Seat();
//        String s ;
//        List<String > list = seat.seaT();
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext())
//        {
//            s = iterator.next();
//            System.out.println(s);
//        }
//    }
//}