/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2912;

public class AfterTest {

	public static void main(String[] args) {
		User user = new User();
		user.setAge(34);
		user.setSex("男");
		user.setUserId("365itedu@365itedu.com");
		user.setUserName("365itedu");
		After resolveParameter = new After();
		resolveParameter.addUser(user);
	}

}
