package org.wdzl.first.HolidayTwo;

import java.util.Comparator;

public class ComparatorByweight implements Comparator<dogManage> {
    @Override
    public int compare(dogManage o1, dogManage o2) {
        return (int)(o1.getWeight()-o2.getWeight());
    }
}
