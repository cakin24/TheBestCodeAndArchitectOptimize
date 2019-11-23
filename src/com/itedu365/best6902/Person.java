/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6902;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  69、如何梳理混杂的架构体系
 *
 *  重构23 —— 以委托代替继承
 *
 *  @author 颜廷吉
 */
public class Person {
    // 姓名
    private String name;
    // 组合：洗手类
    private Washing washing;
    // 构造方法
    public Person(String name) {
        this.name = name;
        this.washing = new Washing();
    }
    // 委托方法
    public String washHands() {
        return washing.washHands(this.name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
