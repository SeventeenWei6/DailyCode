package org.wdzl.first.HolidayFive;

import java.io.*;

public class Demo_6_Sequence {
    public static void main(String[] args)  {
        try {
            InputStream is1 = new FileInputStream("f:\\stu.txt");
            InputStream is2 = new FileInputStream("f:\\abcd.txt");
            OutputStream os = new FileOutputStream("f:\\abcd.txt");
            SequenceInputStream sis = new SequenceInputStream(is1, is2);
            int temp = 0;
            while ((temp = sis.read())!=-1) {
                os.write(temp);
            }
            sis.close();
            os.close();
            is1.close();
            is2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
