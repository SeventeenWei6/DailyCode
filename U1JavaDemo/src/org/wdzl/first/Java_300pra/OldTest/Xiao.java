package org.wdzl.first.Java_300pra.OldTest;

import org.wdzl.first.Java_300pra.OldTest.DemoShengAndXiao;

public class Xiao implements Runnable {
    private DemoShengAndXiao dsax;
    public Xiao(DemoShengAndXiao dsax)
    {
        this.dsax = dsax;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            dsax.Xiao();
        }
    }
}
