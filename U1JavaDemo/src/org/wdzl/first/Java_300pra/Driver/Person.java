package org.wdzl.first.Java_300pra.Driver;

public class Person {
    private int Did;
    private String Dname;
    private int Didnumber;
    private String Dsex;
    private String Dadd;
    private int Dphone;
    private String Dsize;
    private int Dtime;
    private String Dpwd;

    public Person(String dname, String dpwd) {
        Dname = dname;
        Dpwd = dpwd;
    }

    public Person(int did, String dname, int didnumber, String dsex, String dadd, int dphone, String dsize, int dtime, String dpwd) {
        Did = did;
        Dname = dname;
        Didnumber = didnumber;
        Dsex = dsex;
        Dadd = dadd;
        Dphone = dphone;
        Dsize = dsize;
        Dtime = dtime;
        Dpwd = dpwd;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int did) {
        Did = did;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public int getDidnumber() {
        return Didnumber;
    }

    public void setDidnumber(int didnumber) {
        Didnumber = didnumber;
    }

    public String getDsex() {
        return Dsex;
    }

    public void setDsex(String dsex) {
        Dsex = dsex;
    }

    public String getDadd() {
        return Dadd;
    }

    public void setDadd(String dadd) {
        Dadd = dadd;
    }

    public int getDphone() {
        return Dphone;
    }

    public void setDphone(int dphone) {
        Dphone = dphone;
    }

    public String getDsize() {
        return Dsize;
    }

    public void setDsize(String dsize) {
        Dsize = dsize;
    }

    public int getDtime() {
        return Dtime;
    }

    public void setDtime(int dtime) {
        Dtime = dtime;
    }

    public String getDpwd() {
        return Dpwd;
    }

    public void setDpwd(String dpwd) {
        Dpwd = dpwd;
    }
}
