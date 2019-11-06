package org.wdzl.first.Java_300pra.OldTest;

import org.wdzl.first.Java_300pra.OldTest.DemoShengAndXiao;

public class Sheng implements Runnable {
    private DemoShengAndXiao dsax;
    public Sheng(DemoShengAndXiao dsax)
    {
        this.dsax = dsax;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if(i%2==0)
            {
                dsax.Sheng("产品1");
            }
            else {
                dsax.Sheng("产品2");
            }
        }
    }
}
