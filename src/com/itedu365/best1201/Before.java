/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1201;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  12、避免使用魔法数字
 *
 *  重构04 —— 用常量取代魔法数
 *
 *  @author 颜廷吉
 */
public class Before {
	public static void method(int type) {
		// 白色
		if (type == 10) {
			System.out.println("I am white!");
			// 黑色
		} else if (type == 20) {
			System.out.println("I am black!");
		}
	}

}
