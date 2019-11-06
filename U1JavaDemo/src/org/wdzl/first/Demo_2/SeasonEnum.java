package org.wdzl.first.Demo_2;

public enum SeasonEnum {
    MALE("男"),FAMLE("女");
    private final String name;
    private SeasonEnum(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return  this.name;
    }
}

