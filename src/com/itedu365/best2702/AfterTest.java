/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2702;

public class AfterTest {
	public static void main(String[] args) {
		String regEx = "^13[0-9]{9}$";
		System.out.println("验证字符串电话号码，" + "" + "：" + After.validate(regEx, null));
	}

}
