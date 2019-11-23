/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best4702;

import java.util.HashMap;
import java.util.Map;

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
public class SessionInfo {
    // 放session内容的Map
    private Map<String, Object> session = new HashMap<String, Object>();
    // 构造函数
    public void setSessionInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("yantingji");
        userInfo.setUserId("yantingji@365itedu.com");
        session.put("UIO", userInfo);
    }
    public Map<String, Object> getSession() {
        return session;
    }
}
