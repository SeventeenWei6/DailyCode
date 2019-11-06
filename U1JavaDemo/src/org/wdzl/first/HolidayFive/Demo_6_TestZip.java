package org.wdzl.first.HolidayFive;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
* 压缩流:运用压缩流，节省流量，节省时间，方便传输
*
* */
public class Demo_6_TestZip {
    public static void main(String[] args) {
        File f = new File("f:\\stu.txt");
        File zipf = new File("f:\\stu.zip");
        try{
            InputStream is = new FileInputStream(f);
            ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipf));
            zip.putNextEntry(new ZipEntry(f.getName()));
            int temp = 0;
            while((temp = is.read())!=-1)
            {
                zip.write(temp);
            }
            zip.close();
            is.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
