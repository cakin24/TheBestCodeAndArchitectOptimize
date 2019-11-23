/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best4602;

public class SessionInfoTest {
    public static void main(String[] args) {
        // 定义sessionInfo变量
        SessionInfo sessionInfo = new SessionInfo();
        // 定义userInfo变量
        UserInfo userInfo = new UserInfo();

        // userInfo赋值
        userInfo.setId("yantingji@365itedu.com");
        userInfo.setIp("127.0.0.1");
        // sessionInfo赋值
        sessionInfo.getSession().put("UIO", userInfo);

        // 从sessionInfo里取值
        UserInfo userInfo2 = (UserInfo) sessionInfo.getSession().get("UIO");
        System.out.println(userInfo2.getId());
        System.out.println(userInfo2.getIp());
    }
}
