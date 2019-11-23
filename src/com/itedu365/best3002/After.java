/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3002;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  30、不要重写静态方法为什么不要重写静态方法
 *
 *  @author 颜廷吉
 */
public class After extends Base {
    // 子类静态方法
    public static void staticChildMethod() {
        System.out.println("Father Static Method");
    }
    // 同名子类非静态方法
    public void commonMethod() {
        System.out.println("Child Common Method");
    }
}
