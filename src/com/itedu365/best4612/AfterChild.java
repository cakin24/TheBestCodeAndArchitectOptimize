/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4612;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  46、避免有深度耦合的类关系
 *
 *  重构14 —— 移动变量（具有父子关系）
 *
 *  @author 颜廷吉
 */
public class AfterChild extends AfterFather {
    // 奶瓶
    private String milkBottle;
    // 构造方法
    AfterChild(String name, String milkBottle) {
        super.name = name;
        this.milkBottle = milkBottle;
    }
    public void method() {
        System.out.println(milkBottle);
        System.out.println(super.name);
    }
    public String getMilkBottle() {
        return milkBottle;
    }
    public void setMilkBottle(String milkBottle) {
        this.milkBottle = milkBottle;
    }
}
