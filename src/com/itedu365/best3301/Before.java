/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3301;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  33、避免重复发明轮子
 *
 *  @author 颜廷吉
 */
public class Before {
    public static void method() {
        String emptyStr = "";
        String nullStr = null;
        System.out.println(isEmpty(emptyStr));
        System.out.println(isEmpty(nullStr));
    }

    // 自定义isEmpty方法
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }
}
