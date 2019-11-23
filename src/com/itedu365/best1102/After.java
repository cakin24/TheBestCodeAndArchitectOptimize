/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1102;

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
public class After {

	public static void method() {
		// 临时变量类型
		String tempType = "";
		// 临时变量姓名
		String tempName = "";
		tempType = "This is " + getType();
		System.out.println(tempType);
		tempName = "My name is " + getName();
		System.out.println(tempName);
	}

	private static String getName() {
		return "365ITEDU";
	}

	private static String getType() {
		return "education!";
	}

}
