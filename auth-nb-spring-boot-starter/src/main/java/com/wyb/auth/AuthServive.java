package com.wyb.auth;

/**
 * @Author: wyb
 * @Date: 2020/10/19 23:44
 */
public class AuthServive {
    private String name;
    private String type;
    private String code;
    public AuthServive(String name, String type, String code) {
    this.code=code;
    this.name=name;
    this.type=type;
    }

    public String login(String str) {
        return name + type + code+str;
    }
}
