package org.wdzl.first.ch9;

public class PhoneTest {
    public static void main(String[] args) {
        Handset temp1 = new PhoneAptitude("华为","p10");
        PhoneCommon temp2 = new PhoneCommon("诺基亚","001");
        temp1.call();
        temp1.sendInfo();
        temp1.info();
        ((PhoneAptitude) temp1).Network();
        ((PhoneAptitude) temp1).TheakePicture();
        temp2.call();
        temp2.sendInfo();
        temp2.info();
        temp2.Wiring();

    }
}
