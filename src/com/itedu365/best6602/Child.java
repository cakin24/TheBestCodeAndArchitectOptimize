/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best6602;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 * 66、架构优化原则 —— 里式替换原则
 *
 * @author 颜廷吉
 */
public class Child extends Parent {
    // 避开重写父类方法
    public Integer method2(Integer int1, Integer int2) {
        // 输出参数
        System.out.println("参数1:" + int1 + "，参数2:" + int2);
        // 加法
        return int1 + int2;
    }
}
