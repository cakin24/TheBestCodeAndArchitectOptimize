/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best2802;
/**
*
* 【Java代码与架构之完美优化——实战经典】
*
*  28、避免使用可变参数
*
*  @author 颜廷吉
*/
public class After {
    // 打印方法1
    public static void print(String para1, Integer para2) {
    }
    // 打印方法2
    public static void print(String para1, String para2) {
    }
    // 测试方法
    public static void testMethod() {
        print("hello", 365);
        print("hello","365itedu");
    }
}


