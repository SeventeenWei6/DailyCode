package org.wdzl.first.Java_300pra.OldTest;

import org.wdzl.first.Java_300pra.OldTest.DemoShengAndXiao;
import org.wdzl.first.Java_300pra.OldTest.Sheng;
import org.wdzl.first.Java_300pra.OldTest.Xiao;

public class Test {
    public static void main(String[] args) {
        DemoShengAndXiao temp1 = new DemoShengAndXiao();
        Sheng sheng = new Sheng(temp1);
        Xiao xiao = new Xiao(temp1);
        new Thread(sheng).start();
        new Thread(xiao).start();
    }
}
