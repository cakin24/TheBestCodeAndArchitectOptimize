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
public class User {
    // 成员变量
    private String userName;
    private String userId;
    private String sex;
    private Integer age;

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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
