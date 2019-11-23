/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best4702;

public class SessionInfoTest {
	public static void main(String[] args) {
		SessionInfo sesionInfo = new SessionInfo();
		sesionInfo.setSessionInfo();
		UserInfo UserInfo = (UserInfo) sesionInfo.getSession().get("UIO");
		System.out.println(UserInfo.getUserName());
		System.out.println(UserInfo.getUserId());
	}
}
