package org.wdzl.first.HolidayThree;

public class ShiyongleiTest {
    public static void main(String[] args) {
        char []values = {'a','g','E','5',',','8','h','b','&','q',';'};
        int Lowercase = 0;
        int Uppercase = 0;
        for(int i = 0;i < values.length;i++)
        {
            if(Character.isLowerCase(values[i]))
            {
                Lowercase++;
            }
            if(Character.isUpperCase(values[i]))
            {
                Uppercase++;
            }
        }
        System.out.println("一共有:"+Lowercase+"个小写字母");
        System.out.println("一共有:"+Uppercase+"个大写字母");
    }
}
