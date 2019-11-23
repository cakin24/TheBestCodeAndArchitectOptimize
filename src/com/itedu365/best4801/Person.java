/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4801;

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
    // 手机类成员变量
    private Mobile mobile;
    // 构造函数
    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Mobile getMobile() {
        return mobile;
    }
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
