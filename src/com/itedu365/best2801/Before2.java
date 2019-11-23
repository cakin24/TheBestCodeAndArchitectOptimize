/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2801;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  28、避免使用可变参数
 *
 *  @author 颜廷吉
 */
public class Before2 {
    // 打印方法1
    public static void print(String test, Integer... is) {
    }
    // 打印方法2
    public static void print(String test, String... args) {
    }

    public static void testMethod() {
        // 因为两个方法都匹配，编译器不知道选哪个，于是报错了。
        // 这里同时还有个非常不好的编码习惯，即调用者隐藏了实参类型，
        // 这是非常危险的，不仅仅调用者需要“猜测”该调用哪个方法，
        // 而且被调用者也可能产生内部逻辑混乱的情况。
        //	        print("hello");
        //	        print("hello", null);
    }

}
