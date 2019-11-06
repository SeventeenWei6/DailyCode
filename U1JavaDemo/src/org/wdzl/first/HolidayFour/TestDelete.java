package org.wdzl.first.HolidayFour;

import java.io.File;

public class TestDelete {
    public static void main(String[] args) {
        File f = new File("F:\\aaa");
        System.out.println(f.delete());

    }
}
