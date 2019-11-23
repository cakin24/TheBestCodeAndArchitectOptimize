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
*  懒汉式，双重锁定检查（DCL）
*
*  @author 颜廷吉
*/
public class After1 {
    // 静态成员变量
    private static After1 instance = null;
    // 构造方法
    private After1() {
    }
    // 获取实例：懒汉式，双重锁定检查（DCL）
    public static After1 getInstance() {
         if (instance == null) {
             synchronized (new After1()) {
                 if (instance == null) {
                     instance = new After1();
                 }
             }
         }
        return instance;
    }
}


