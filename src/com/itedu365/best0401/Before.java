/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best0401;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  04、剪切无效代码
 *
 *  @author 颜廷吉
 */
public class Before {
    // 成员变量
    private String name;

    public static void method1() {
        // 临时变量
        int i;
        method2("365ITEDU", null);
    }

    // 参数
    private static void method2(String str1, String str2) {
        System.out.println(str1);

    }

    // 方法
    private static void method3(String str1, String str2) {
        System.out.println(str1);

    }
}

// 类
class TestClass {
    private static void test(String str1, String str2) {
        System.out.println(str1);
    }
}
