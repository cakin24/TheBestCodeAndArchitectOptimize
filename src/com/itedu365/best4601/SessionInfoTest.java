package com.itedu365.best4601;


public class SessionInfoTest {
    public static void main(String[] args) {
        // 定义sessionInfo变量
        SessionInfo sessionInfo = new SessionInfo();
        // 定义userInfo变量
        UserInfo userInfo = new UserInfo();

        // userInfo赋值
        userInfo.setId("yantingji@365itedu.com");
        // sessionInfo赋值
        sessionInfo.getSession().put("UIO", userInfo);
        sessionInfo.getSession().put("IP", "127.0.0.1");

        // 从sessionInfo里取值
        UserInfo userInfo2 = (UserInfo) sessionInfo.getSession().get("UIO");
        System.out.println(userInfo2.getId());
        System.out.println(sessionInfo.getSession().get("IP"));
    }
}
