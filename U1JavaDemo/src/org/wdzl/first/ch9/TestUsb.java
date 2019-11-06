package org.wdzl.first.ch9;

public class TestUsb {
    public static void main(String[] args) {
        Usb temp1 = new FengShan();
        Usb temp2 = new Shubiao();
        Usb temp3 = new Upan();
        temp1.sentData(2);
        temp2.sentData(1);
        temp3.sentData(3);
    }
}
