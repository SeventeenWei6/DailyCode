package org.wdzl.first.Java_300pra.OldTest;

import java.io.*;

/*
* 文件夹的拷贝
* 1.文件赋值  copyfile
* 2.文件 创建 mkdirs()
* 3.递归查找子孙级
* */
public class copyFile {

    public  static  void copydir(String src,String dest){
        File file = new File(src);
        File file1 = new File(dest);
        if(file.isDirectory()){
            file1 = new File("F:\\zhangwei1",file.getName());
        }
        copyDir(file,file1);
    }
    public  static  void copyDir(File src, File dest)
    {
        if(src.isFile()) //若是文件 直接copy
        {
            File file = src;
            File file1 = dest;

            try {
                InputStream is = new FileInputStream(file);
                OutputStream os = new FileOutputStream(file1);
                byte arr[] = new byte[1024];
                int len = 0;
                int i = 0;
                while( -1 !=(len  =  is.read(arr)))
                {
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
        else if(src.isDirectory())  //否则循环递归
        {
            dest.mkdir();
            for(File sub:src.listFiles())
            {
                copyDir(sub,new File(dest,src.getName()));
            }
        }
    }
}
