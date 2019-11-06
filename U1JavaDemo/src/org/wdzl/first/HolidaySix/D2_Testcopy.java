package org.wdzl.first.HolidaySix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D2_Testcopy {
    public static void main(String[] args) throws IOException {
        //4
        File f  = new File("F:\\data.txt");
        File fn = new File("f:\\datan.txt");
        if(!fn.exists())
        {
            fn.createNewFile();
        }
        FileInputStream fi = new FileInputStream(f);
        FileOutputStream fo = new FileOutputStream(fn);
        byte b [] = new byte[(int)f.length()];
        fi.read(b,0,(int)f.length());
        fo.write(b,0,b.length);
        fi.close();
        fo.close();
    }
}
