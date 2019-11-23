/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1901;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  19、如何深入理解“==”的真正含义
 *
 *  @author 颜廷吉
 */
public class Before {

	public static void method() {
		// 包装类型
		//Integer -128～127
		Integer score1 = 127;
		Integer score2 = 127;
		if (score1 == score2) {
			System.out.println("score1==score2");
		} else {
			System.out.println("score1!=score2");
		}
		//Integer -128～127以外
		Integer score3 = 128;
		Integer score4 = 128;
		if (score3 == score4) {
			System.out.println("score3==score4");
		} else {
			System.out.println("score3!=score4");
		}
		// new 形式
		if (new Integer(1) == new Integer(1)) {
			System.out.println("OK!");
		} else {
			System.out.println("NG!");
		}
		// 一般对象
		Before theBest1 = new Before();
		Before theBest2 = new Before();
		if (theBest1 == theBest2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
