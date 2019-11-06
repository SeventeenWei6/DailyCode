package org.wdzl.first.HolidayFour;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f = new File("F:\\wei_z.txt");
        try
        {
            if(!f.exists())
            {
                f.createNewFile();
                System.out.println("创建成功");
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
