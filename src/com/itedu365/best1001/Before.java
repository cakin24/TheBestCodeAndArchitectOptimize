/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1001;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  10、去掉控制标志的临时变量
 *
 *  重构02 —— 移除控制标志临时变量
 *
 *  @author 颜廷吉
 */
public class Before {

	public static void method() {
		System.out.println(getLevel(1));
	}

	private static String getLevel(int type) {
		// 结果控制标志临时变量
		String resultData = "";
		if (type == 1) {
			resultData = "第一名";
		} else if (type == 2) {
			resultData = "第二名";
		} else {
			resultData = "第三名";
		}

		return resultData;
	}

}
