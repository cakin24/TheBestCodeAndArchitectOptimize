/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3412;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  34、如何对臃肿的方法进行瘦身
 *
 *  重构13 —— 提炼方法
 *
 *  @author 颜廷吉
 */
public class After {
    private String person;
    // 对外服务方法（主方法）
    public void sleep(String person) {
        this.person = person;
        wash();
    }
    // 实际处理层
    private void wash() {
        System.out.println(person + "洗澡");
        System.out.println(person + "刷牙");

    }

}
