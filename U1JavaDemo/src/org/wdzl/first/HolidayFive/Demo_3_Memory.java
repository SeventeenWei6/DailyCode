package org.wdzl.first.HolidayFive;

import javax.imageio.IIOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Demo_3_Memory {
    public static void main(String[] args)throws IOException {
        String str = "abcdefg";
        ByteArrayInputStream bis =null;
        ByteArrayOutputStream bos = null;
        bis  = new ByteArrayInputStream(str.getBytes());
        bos = new ByteArrayOutputStream();
        int temp = 0;
        while((temp = bis.read())!=-1)
        {
            char ch = (char)temp;
            bos.write(Character.toUpperCase(ch));
        }
        String newStr= bos.toString();
        System.out.println(newStr);
        bos.close();
        bis.close();


    }
}
