package org.wdzl.first.DemoNewFirst;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testJunit {
    @Before
    public void Init()
    {
        System.out.println("初始化...");
    }
   @Test
    public void testAdd()
    {
        Demo_1_TestJunit test = new Demo_1_TestJunit();
        int rec = test.add(3,4);
        Assert.assertEquals(7,rec);
        System.out.println(rec);

    }
    @After
    public void close()
    {
        System.out.println("释放资源");
    }

}
