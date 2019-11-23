/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4802;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  48、如何优化冗赘类
 *
 *  重构17 —— 提炼类
 *
 *  @author 颜廷吉
 */
public class Person {
    // 姓名
    private String name;
    // 电话号码
    private String phoneNumber;
    // 构造函数
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
