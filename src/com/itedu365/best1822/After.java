/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1822;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  18、避免使用复杂条件式或分支
 *
 *  重构08 —— 用多态代替条件表达式
 *
 *  @author 颜廷吉
 */
public class After {

	public static void method() {
		Fruits apple = new Apple("苹果");
		// 吃苹果
		apple.eatMethod();
		Fruits banana = new Banana("香蕉");
		// 吃香蕉
		banana.eatMethod();
	}

}
