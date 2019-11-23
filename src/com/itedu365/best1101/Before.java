/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1101;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  11、避免赋予临时变量过多的角色
 *
 *  重构03 —— 赋予临时变量单一职责
 *
 *  @author 颜廷吉
 */
public class Before {

	public static void method() {

		String temp;
		// 赋予临时变量职责1
		temp = "This is " + getType();
		System.out.println(temp);
		// 赋予临时变量职责2
		temp = "My name is " + getName();
		System.out.println(temp);
	}

	private static String getName() {
		return "365ITEDU";
	}

	private static String getType() {
		return "education!";
	}

}
