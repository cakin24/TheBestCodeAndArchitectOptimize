/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4302;

import com.itedu365.best4301.Utils;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  43、为什么不要使用静态引入
 *
 *  @author 颜廷吉
 */
public class After {

    public static void method() {
        // 外部类静态方法
        Utils.staticMethod();
        // 本类静态方法
        thisClassStaticMethod();
    }
    public static void thisClassStaticMethod() {
        System.out.println("Before.staticMethod");
   }
}
