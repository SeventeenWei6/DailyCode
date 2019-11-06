package org.wdzl.first.Java_300pra.OldTest;

import org.wdzl.first.Java_300pra.OldTest.copyFile;

import java.io.*;

public class TestFile {
    public static void main(String[] args) {
//        File file = new File("F:\\testfile.txt");
//        if(!file.exists())
//        {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            OutputStream os = new FileOutputStream(file);
//            String  str = "hello";
//            os.write(str.getBytes());
//            os.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        copyFile.copydir("F:\\zhangwei","F:\\zhangwei1");
    }
    public  static  void copyFile(String src,String dest)
    {
        File file = new File(src);
        File file1 = new File(dest);

        try {
            InputStream is = new FileInputStream(file);
            OutputStream os = new FileOutputStream(file1);
            byte arr[] = new byte[1024];
            int len = 0;
            int i = 0;
            while( -1 !=(len  =  is.read(arr)))
            {
                i++;
                System.out.println(len);
                os.write(arr,0,len);
            }
            os.close();
            is.close();
            System.out.println(i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
