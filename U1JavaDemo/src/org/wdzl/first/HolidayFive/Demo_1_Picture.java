package org.wdzl.first.HolidayFive;

import java.io.*;

public class Demo_1_Picture {

    public static void main(String[] args) {
        //字节
        DataInputStream dis = null;
        DataOutputStream dos = null;
        FileInputStream fis = null;
        FileOutputStream fos =null;
      try{
          //创建输入流
          fis =  new FileInputStream("F:\\12.jpg");
          dis = new DataInputStream(fis);
          //创建输入流对象
          fos = new FileOutputStream("E:\\13.jpg");
          dos = new DataOutputStream(fos);
          //读写文件
      }catch (FileNotFoundException e)
      {
          e.printStackTrace();
      }
      catch (IOException e)
      {
          e.printStackTrace();
      }
      finally {
          try{
              if(fos != null)
              {
                  fos.close();
              }
              if(fis != null) {
                  fis.close();
                  dos.close();
                  dis.close();
              }

          }catch (IOException e){
              e.printStackTrace();
      }

      }


    }
}
