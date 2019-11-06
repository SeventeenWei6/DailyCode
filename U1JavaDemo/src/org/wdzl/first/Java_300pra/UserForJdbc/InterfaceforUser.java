package org.wdzl.first.Java_300pra.UserForJdbc;
/*
* 用户类注册和登录接口
* */
public interface InterfaceforUser {

    public  User LoginUser(String name);//用户登录
    public boolean addUser(User  user);//用户注册

}
