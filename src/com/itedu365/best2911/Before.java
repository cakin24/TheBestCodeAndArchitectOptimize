/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2911;

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
public class Before {

    // 添加用户
    public void addUser(String userName, String userId, Integer age, String sex) {
        System.out.println("添加用户姓名：" + userName);
        System.out.println("添加用户ID：" + userId);
        System.out.println("添加用户年龄：" + age);
        System.out.println("添加用户性别：" + sex);
    }

}
