/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best5701;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  57、避免乱用异常
 *
 *  @author 颜廷吉
 */
public class Before {

	public static void method() {
		String[] strArray = { "1", "2" };
		try {
			// 错用异常来引导程序的逻辑
			System.out.println(strArray[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		}
	}

}
