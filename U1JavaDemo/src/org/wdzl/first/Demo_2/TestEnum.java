package org.wdzl.first.Demo_2;


import javax.naming.MalformedLinkException;

public class TestEnum {

    public static void main(String[] args) {
        for(SeasonEnum temp:SeasonEnum.values())
        {
            System.out.println(temp);
        }
        SeasonEnum t = SeasonEnum.FAMLE;
        System.out.println(t.getName());
}
}
