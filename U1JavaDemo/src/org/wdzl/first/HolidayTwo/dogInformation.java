package org.wdzl.first.HolidayTwo;

import java.util.*;

public class dogInformation {
    private String name;
    private String kind;

    public dogInformation(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }
}
class Test{
    public static void main(String[] args) {
        //Set<dogInformation> dogTemp = new HashSet<dogInformation>();
        List dogTemp = new ArrayList();
        dogInformation temp1 = new dogInformation("欧欧","雪娜瑞");
        dogInformation temp2 = new dogInformation("亚亚","拉布拉多");
        dogInformation temp3 = new dogInformation("菲菲","拉布拉多");
        dogInformation temp4 = new dogInformation("丽丽","雪纳瑞");
        dogTemp.add(temp1);
        dogTemp.add(temp2);
        dogTemp.add(temp3);
        dogTemp.add(temp4);

        dogTemp.remove(temp2);
        Iterator<dogInformation> it = dogTemp.iterator();
        while(it.hasNext())
        {
            dogInformation o = it.next();
            System.out.println(o.getName()+"  "+o.getKind());
//            dogInformation d = (dogInformation) o;
//            System.out.println(d.getName()+"  "+d.getKind());
        }
        System.out.println(dogTemp.contains(temp4));
    }
}
