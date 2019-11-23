/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best0112;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  01、避免使用空块  —— 多余大括号({})
 *
 *  @author 颜廷吉
 */
public class After {
	public static void method(boolean isTrue) {
		if (isTrue) {
			// TODO 需求未定
		}
		System.out.println("OK");
	}
}
