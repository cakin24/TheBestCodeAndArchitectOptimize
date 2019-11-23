/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2201;

public class BeforeTest {
	public static void main(String[] args) {
		System.out.println("验证字符串电话号码，" + "" + "：" + Before.isPhoneNum(""));
		System.out.println("验证字符串电话号码，" + "1111" + "：" + Before.isPhoneNum("1111"));
		System.out.println("验证字符串电话号码，" + "99999999999" + "：" + Before.isPhoneNum("21111111111"));
		System.out.println("验证字符串电话号码，" + "13a11111111" + "：" + Before.isPhoneNum("13a11111111"));
		System.out.println("验证字符串电话号码，" + "1311111111啊" + "：" + Before.isPhoneNum("1311111111啊"));
		System.out.println("验证字符串电话号码，" + "13999999999" + "：" + Before.isPhoneNum("13999999999"));
	}
}
