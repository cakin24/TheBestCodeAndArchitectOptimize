/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2501;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  25、使用str.equal("String")带来的弊端
 *
 *  @author 颜廷吉
 */
public class Before {
	// 参数字符串等于365itedu则输出OK
	public static void method(String str) {
		if (str != null && str.equals("365itedu")) {
			System.out.println("OK");
		}
	}
}
