/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4702;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  47、如何为臃肿的类进行手术
 *
 *  重构16 —— 分解类
 *
 *  @author 颜廷吉
 */
public class UserInfo {
    // 用户姓名
    private String userName;
    // 用户ID
    private String userId;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
