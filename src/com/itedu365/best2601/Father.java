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
public class Father {
    // 私有方法
    private void mehtod() {
        System.out.println("FatherMethod");
    }
    // 同名静态方法
    public static void method() {
        Father father = new Father();
        father.mehtod();
    }

}
