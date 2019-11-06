package org.wdzl.first.HolidayTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class newsTest {
    public static void main(String[] args) {
        //List<News> newtemp = new ArrayList<News>();
        LinkedList<News> newtemp = new LinkedList<News>();
        News temp[] = new News[3];
        temp[0] = new News("001","汽车","zhangsan");
        temp[1] = new News("002","高考","lisi");
        temp[2] = new News("003","体育","wangmazi");
        for (int i = 0;i < temp.length;i++)
        {
            newtemp.add(temp[i]);
        }
        System.out.print("第一条新闻:");
        News d = newtemp.getFirst();
        System.out.println(d.getName());
        System.out.println("最后一条新闻:");
        News s= newtemp.getLast();
        System.out.println(s.getName());
        System.out.println("新闻总标题数:"+newtemp.size());
        newtemp.removeFirst();
        newtemp.removeLast();

        for (News n:newtemp) {
            System.out.println(n.getName());

        }
    }
}
