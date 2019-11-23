/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3601;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  36、避免使用非线程安全的初始化方法
 *
 *  @author 颜廷吉
 */
public class Before {
    // 类实例静态成员变量
    private static Before instance = null;
    // 静态成员变量
    private static int count = 0;
    // 取值：懒汉式初始化方式
    public static Before getInstance() {
        if (instance == null) {
            instance = new Before();
            count++;
        }
        System.out.println(count);
        return instance;
    }
}
