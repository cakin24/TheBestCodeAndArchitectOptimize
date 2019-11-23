/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2601;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  26、避免命名不具有继承关系的同名方法
 *
 *  @author 颜廷吉
 */
public class Child extends Father {
    //公有方法：子类和父类使用相同的方法名称
    public void mehtod() {
        System.out.println("ChildMethod");
    }

}
