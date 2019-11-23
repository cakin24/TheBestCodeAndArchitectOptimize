/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4901;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  49、避免在接口中出现实现代码
 *
 *  @author 颜廷吉
 */
public interface Before {
    // 实例化一个接口
    public static CommonInterface commonInterface = new CommonInterface() {
        public void method1() {
            System.out.println("hello");
        }
    };
    // 自己类接口
    public void method2();
}
