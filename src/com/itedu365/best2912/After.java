/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2912;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  29、如何优化过长参数
 *
 *  重构11 —— 引入参数对象
 *
 *  @author 颜廷吉
 */
public class After {
    // 添加用户：参数只有一个
    public void addUser(User user) {
        System.out.println("添加用户姓名：" + user.getUserName());
        System.out.println("添加用户ID：" + user.getUserId());
        System.out.println("添加用户年龄：" + user.getAge());
        System.out.println("添加用户性别：" + user.getSex());
    }
}
