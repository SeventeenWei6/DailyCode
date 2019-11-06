package org.wdzl.first.HolidayNine;

import java.io.Serializable;

public class D4_User implements Serializable {
    private  String name;
    private  String ID;

    public D4_User(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }
}
