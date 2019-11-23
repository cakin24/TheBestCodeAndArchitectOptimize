/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4401;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  44、如何正确使用instanceof
 *
 *  @author 颜廷吉
 */
public abstract class Fruits {
    // 姓名变量
    protected String name;
    // 重写equals方法
    public boolean equals(Object obj) {
        // 没用instanceof关键字来判断是否是同一个类
        Fruits temp = (Fruits) obj;
        boolean isEquals = temp.name == name;
        return isEquals;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
