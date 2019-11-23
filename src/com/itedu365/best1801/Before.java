/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1801;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  18、避免使用复杂条件式或分支
 *
 *  重构06 —— 用代码片段拆分复杂表达式
 *
 *  @author 颜廷吉
 */
public class Before {

	public static void method() {
		// 月可攒钱=基本工资+奖金-税-基本生活费
		if (getBaseMoney("1") + getBonus(205) - getTax("1") - 1000 > 2000) {
			System.out.println("Happy!");
		}
	}

	// 基本工资
	public static int getBaseMoney(String type) {
		if ("1".equals(type)) {
			return 2000;
		}
		return 4000;
	}

	// 所得奖金
	public static int getBonus(Integer workTime) {
		if (workTime > 200) {
			return 1000;
		}
		return 0;
	}

	// 所交税
	public static int getTax(String type) {
		if ("1".equals(type)) {
			return 200;
		}
		return 300;
	}
}
