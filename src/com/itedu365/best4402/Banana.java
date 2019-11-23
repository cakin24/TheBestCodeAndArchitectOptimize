/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4402;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  44、如何正确使用instanceof
 *
 *  @author 颜廷吉
 */
public class Banana extends Fruits {
    // 构造方法
    public Banana(String name) {
        this.name = name;
    }
    public boolean equals(Object obj) {
        // 用instanceof判断是否是本类
        if (obj instanceof Banana) {
            Banana temp = (Banana) obj;
            return temp.name == name;
        }
        return false;
    }
}