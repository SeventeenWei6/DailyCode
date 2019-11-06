package org.wdzl.first.HolidayTwo;

public class News {
    private String id;
    private String name;
    private String builder;

    public News(String id, String name, String builder) {
        this.id = id;
        this.name = name;
        this.builder = builder;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBuilder() {
        return builder;
    }
}
