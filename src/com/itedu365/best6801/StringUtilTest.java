/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6801;

public class StringUtilTest {
	public static void main(String[] args) {
		String str = null;
		if (getName(str) != null) {
			System.out.println("Not null str");
		}
	}

	private static String getName(String str) {
		return StringUtil.changeNullToStr(str);
	}
}
