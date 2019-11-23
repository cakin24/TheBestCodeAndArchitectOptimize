/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2202;

public class AfterTest {
	public static void main(String[] args) {
		String regEx = "^13[0-9]{9}$";
		System.out.println("验证字符串电话号码，" + "" + "：" + After.validate(regEx, ""));
		System.out.println("验证字符串电话号码，" + "1111" + "：" + After.validate(regEx, "1111"));
		System.out.println("验证字符串电话号码，" + "99999999999" + "：" + After.validate(regEx, "21111111111"));
		System.out.println("验证字符串电话号码，" + "13a11111111" + "：" + After.validate(regEx, "13a11111111"));
		System.out.println("验证字符串电话号码，" + "1311111111啊" + "：" + After.validate(regEx, "1311111111啊"));
		System.out.println("验证字符串电话号码，" + "13999999999" + "：" + After.validate(regEx, "13999999999"));
	}
}
