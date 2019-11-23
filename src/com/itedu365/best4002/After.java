/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4002;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  40、避免创建不必要的对象
 *
 *  @author 颜廷吉
 */
public class After {

    public static void method() {
        // 常用String对象创建方式
        String itedu365 = "itedu365";
        String itedu365_1 = "itedu365";
        String itedu365_2 = "itedu365";
        System.out.println(itedu365 == itedu365_1);
        System.out.println(itedu365 == itedu365_2);
    }

}
