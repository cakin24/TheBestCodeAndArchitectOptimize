/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3602;
/**
*
* 【Java代码与架构之完美优化——实战经典】
*
*  36、避免使用非线程安全的初始化方法
*
*  饿汉式，在本类定义静态成员变量时生成对象
*
*  @author 颜廷吉
*/
public class After2 {
    // 静态成员变量
    private static After2 instance = new After2();
    // 构造方法
    private After2() {
    }
    // 获取实例：饿汉式，在本类定义静态成员变量时生成对象
    public static After2 getInstance(){
        return instance;
    }
}

