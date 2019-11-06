package org.wdzl.first.HolidayFive;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/*
* 回退流:如果不希望某个内容被读取，要是通过程序解决的话，就需要用回退流
*
*
*
* */
public class Demo_7_TestBack {
    public static void main(String[] args)throws IOException {
        String str = "hello  how are you?";
        byte [] b = str.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        PushbackInputStream pis = new PushbackInputStream(bais);
        System.out.println("使用回退流操作之后:");
        int temp = 0;
        while((temp = pis.read())!=-1){
            if(temp ==','){
                pis.unread(temp); // 回退
                temp = pis.read();// 继续读取其他内容
            }else{
                System.out.print((char)temp);

            }
        }
    }
}
