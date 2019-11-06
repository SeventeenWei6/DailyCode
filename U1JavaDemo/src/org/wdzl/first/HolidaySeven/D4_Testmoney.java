package org.wdzl.first.HolidaySeven;

public class D4_Testmoney {
    public static void main(String[] args) {
        D4_CunAndQu t = new D4_CunAndQu();
        Thread i = new Thread(t,"张三");
        Thread i2 = new Thread(t,"李四");

        i.start();
        i2.start();
    }
}
