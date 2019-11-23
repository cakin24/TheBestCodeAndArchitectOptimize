/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best0601;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  06、去掉重复代码
 *
 *  @author 颜廷吉
 */
public class Before {

	public static void method() {
		// 打印姓名
		printName("365ITEDU");
		// 打印部门
		printDepart("YFANN");
	}

	private static void printName(String name) {
		System.out.println(name + "。");
	}

	private static void printDepart(String depart) {
		System.out.println(depart + "。");
	}

}
