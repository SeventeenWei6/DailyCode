package org.wdzl.first.HolidayFive;

import java.io.*;

public class Demo_2_File {
    public  static  void Copyfile(String oldpath,String newpath)
    {
        //字符流
//        FileReader fr = null;
//        FileWriter fw = null;
//        try
//        {
//           fr = new FileReader(oldpath);
//           fw = new FileWriter(newpath);
//           int n =0;
//           while((n = fr.read())!=-1)
//           {
//
//               fw.write(n);
//           }
//
//           fr.close();
//           fw.close();
//        }
//        catch (FileNotFoundException e )
//        {
//            e.printStackTrace();
//
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
        //字节流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(oldpath);
            fos = new FileOutputStream(newpath);
            int temp = 0;
            byte b[] = new byte[(byte)oldpath.length()];
            while((temp = fis.read(b,0,b.length))!=-1)
            {
                fos.write(b,0,temp);
            }
            fis.close();
            fos.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Copyfile("F:\\abcd.txt","E:\\abcd.txt");
    }
}
