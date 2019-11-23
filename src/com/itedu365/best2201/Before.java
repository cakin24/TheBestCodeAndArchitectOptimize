/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2201;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  22、如何发挥正则表达式的威力
 *
 *  @author 颜廷吉
 */
public class Before {

	// 非正则表达式方式，验证是否是以13开头的电话号码
	public static boolean isPhoneNum(String phoneNum) {
		if (phoneNum == null || "".equals(phoneNum)) {
			return false;
		} else if (phoneNum.length() != 11) {
			return false;
		} else if (!"13".equals(phoneNum.substring(0, 2))) {
			return false;
		} else {
			for (int i = 2; i <= 10; i++) {
				// 0～9的ASCII码值范围是48～57
				char everyPhoneNum = phoneNum.charAt(i);
				if (everyPhoneNum < 48 || 57 < everyPhoneNum) {
					return false;
				}
			}
		}
		return true;
	}

}
