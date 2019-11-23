/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3102;

import java.util.Calendar;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  31、避免使用过时的API
 *
 *  @author 颜廷吉
 */
public class After {

    public static void method() {
        // 过时API的替代方法
        int day = Calendar.DATE;
        System.out.println(day);
    }

}
