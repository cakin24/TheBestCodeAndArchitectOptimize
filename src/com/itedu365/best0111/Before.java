/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best0111;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  01、避免使用空块 —— 多余大括号({})
 *
 *  @author 颜廷吉
 */
public class Before {
	// 如果判断为真打印结果
	public static void method(boolean para) {
		boolean isTrue = para;
		{
		}
		if (isTrue) {
		}
		System.out.println("OK");
	}
}
