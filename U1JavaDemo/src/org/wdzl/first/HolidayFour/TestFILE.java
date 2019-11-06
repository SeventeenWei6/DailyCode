package org.wdzl.first.HolidayFour;

import javafx.scene.control.Separator;

import java.io.File;

public class TestFILE {
    public  void output(File file)
    {
        if(file!=null)
        {
            if(file.isDirectory())
            {
                File f[] =  file.listFiles();
                if(f!=null)
                {
                    for(int i = 0; i < f.length;i++)
                    {
                        output(f[i]);
                    }
                }
            }
            else
            {
                System.out.println(file);
            }
        }

    }
    public static void main(String[] args) {
       TestFILE t = new TestFILE();
       File f = new File("F:"+File.separator+"Java");
       t.output(f);
    }
}
