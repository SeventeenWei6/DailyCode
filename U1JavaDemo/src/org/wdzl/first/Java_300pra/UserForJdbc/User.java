package org.wdzl.first.Java_300pra.UserForJdbc;

public class User {
    private String name;
    private String pwd;
    private Integer id;

    public User(String name, String pwd, Integer id) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
