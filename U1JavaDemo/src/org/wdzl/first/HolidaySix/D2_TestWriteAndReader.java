package org.wdzl.first.HolidaySix;

import java.io.*;

public class D2_TestWriteAndReader {
    public static void main(String[] args) {
        try
        {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("src/org/wdzl/first/HolidaySix/pat.template"));
            FileWriter fw = new FileWriter("f:\\data.txt");
            BufferedReader r = new BufferedReader(isr);
            BufferedWriter w = new BufferedWriter(fw);
            StringBuffer sb = new StringBuffer();
            String temp;
            while((temp = r.readLine())!=null)
            {
                sb.append(temp);
            }
            System.out.println("替换前:"+sb);
            String s1 = sb.toString().replace("{name}","欧欧");
            s1 = s1.replace("{type}","狗");
            s1 = s1.replace("{master}","张伟");
            System.out.println("替换后:"+s1);
            w.write(s1);
            fw.close();
            isr.close();
        }catch (IOException E)
        {
            E.printStackTrace();
        }
    }
}
