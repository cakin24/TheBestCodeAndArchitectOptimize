/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best7302;

import com.itedu365.best7301ca.RelationC;
/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  73、架构优化原则 —— 无环依赖原则
 *
 *  @author 颜廷吉
*/
public class RelationB {
    // 本类方法B调用了RelationC类的方法C
    public void methodB(){
        System.out.println("This is RelationB!");
        new RelationC().methodC();
    }
}
