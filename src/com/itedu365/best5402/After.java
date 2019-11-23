/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5402;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  54、避免使失败失去原子性
 *
 *  @author 颜廷吉
 */
public class After {

    public static void method() {
        // 事务1
        System.out.println("start transaction!");
        // 向用户表插入一条数据
        System.out.println("update db : insert into user");
        // 向角色表插入一条数据
        System.out.println("update db : insert into user_role");
        System.out.println("end transaction!");
    }
}
