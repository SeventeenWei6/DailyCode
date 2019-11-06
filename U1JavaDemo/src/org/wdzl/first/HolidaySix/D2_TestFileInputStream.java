package org.wdzl.first.HolidaySix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D2_TestFileInputStream {
    public static void main(String[] args) {
//2  3
        try
        {
            File f = new File("F:\\data.txt");
//            FileOutputStream fo = new FileOutputStream(f);
//            String name = "hello文件已更新";
//            byte b[] = name.getBytes();
//            fo.write(b);
//            fo.close();
            int i = 0;
            int temp;
            String name;
            //byte b [] = new byte[(int)f.length()];
            FileInputStream fi = new FileInputStream(f);
            System.out.print("内容:");
            temp = fi.read();
            System.out.println((char)temp);
//            while((temp = fi.read())!=-1)
//            {
//
//                System.out.print((char)temp);
//                //b[i] = (byte) temp;
//               i++;
//            }
//            i = fi.read(b,0,(int)f.length());
            fi.close();
            System.out.println("可读取的字节数:"+i);

            //System.out.println(new String(b));
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
