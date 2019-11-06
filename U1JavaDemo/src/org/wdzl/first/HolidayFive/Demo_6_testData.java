package org.wdzl.first.HolidayFive;

import java.io.*;

public class Demo_6_testData {
    public static void main(String[] args) throws IOException {
        //
//        File f = new File("f:\\data.txt");
//        if (!f.exists()) {
//            f.createNewFile();
//        }
//        DataOutputStream dos = null;
//        try {
//            dos = new DataOutputStream(new FileOutputStream(f));
//            String[] name = {"JAVA", "Pathon", "C++"};
//            float[] price = {68.2f, 60.3f, 61.2f};
//            int[] num = {1, 3, 2};
//            int choice = name.length;
//            dos.writeInt(choice);
//            for (int i = 0; i < name.length; i++) {
//                dos.writeChars(name[i]);
//                dos.writeChar('\t');
//                dos.writeFloat(price[i]);
//                dos.writeChar('\t');
//                dos.writeInt(num[i]);
//                dos.writeChar('\n');
//            }
//            dos.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        File f = new File("f:\\data.txt");
        DataInputStream dis = null;
		dis = new DataInputStream(new FileInputStream(f));
		String name = null;
		float price = 0.0f;
		int num = 0;
		char[] temp = null;
		char c = 0;
		int n = 0;
		int t = dis.readInt();
		while(t>0)
        {
            temp = new char[128];
            n = 0;
            while ((c = dis.readChar()) != '\t') {
                temp[n] = c;
                n++;
            }
            name = new String(temp, 0, n);
            price = dis.readFloat();
            dis.readChar();// 获取\t
            num = dis.readInt();
            dis.readChar();// 获取\t
            System.out.println("名称：" + name + "\t价格：" + price + "\t数量" + num);
            t--;
			}
		}
}