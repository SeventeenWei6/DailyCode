package org.wdzl.first.Java_300pra.LiaoTianShi;

import java.io.Closeable;
import java.io.IOException;
/*
*     在java.io.包下 InputStream，outputStream, Reader, Writer
*     等基类都实现了Closeable接口，因为每次的IO操作结束之后都要去释放资源。
*   1：如果在调用此方法之前 stream已经关闭 ，则方法失效；
*   2：建议先关闭内部的资源，并标记为已关闭；
*   3：优先抛出IO异常；
*
* */
public class CloseUtil {
    public  static  void closeAll(Closeable... io){
        for (Closeable temp:io
             ) {
                try {
                    if(null!=temp) {
                        temp.close();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }


        }
    }
}
