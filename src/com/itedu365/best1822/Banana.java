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
public class Banana extends Fruits {
	public Banana(String name) {
		this.name = name;
	}

	// 香蕉吃法
	public void eatMethod() {
		System.out.println(this.name + "剥皮吃！");
	}
}
