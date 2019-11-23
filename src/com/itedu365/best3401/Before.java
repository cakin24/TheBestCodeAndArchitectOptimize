/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3401;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  34、如何对臃肿的方法进行瘦身
 *
 *  重构12 —— 分解方法
 *
 *  @author 颜廷吉
 */
public class Before {

    public void sleep(String person) {
        // 简单用输出值的方式来表示本方法有很多内部复杂过程处理
        System.out.println(person + "洗澡");
        System.out.println(person + "刷牙");
        System.out.println(person + "脱衣");
        System.out.println(person + "开始睡觉。。。。");
    }

}
