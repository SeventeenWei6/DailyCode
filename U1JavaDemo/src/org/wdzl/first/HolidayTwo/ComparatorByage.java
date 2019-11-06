package org.wdzl.first.HolidayTwo;

import java.util.Comparator;

public class ComparatorByage implements Comparator<dogManage> {
    @Override
    public int compare(dogManage o1, dogManage o2) {
        return o1.getAge()-o2.getAge();
    }
}
