package com.example.a79156.baobingmanager.other.core;

/**
 * author: bigname
 * date 2018/11/21 22:33
 * desc: 用户实体类
 */
public class User {
    // 用户id
    private long uId;
    // 名称
    private String name;
    // 密码
    private String passWord;
    // 性别
    private char sex;
    // 年龄
    private int age;

    public User() {
    }

    public User(long uId, String name, String passWord, char sex, int age) {
        this.uId = uId;
        this.name = name;
        this.passWord = passWord;
        this.sex = sex;
        this.age = age;
    }

    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
