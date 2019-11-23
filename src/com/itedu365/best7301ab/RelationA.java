/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best7301ab;

import com.itedu365.best7301bc.RelationB;
/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  73、架构优化原则 —— 无环依赖原则
 *
 *  @author 颜廷吉
*/
public class RelationA {
    // 本类方法A调用了RelationB类的方法B
    public void methodA(){
        System.out.println("This is RelationA!");
        new RelationB().methodB();
    }

}
