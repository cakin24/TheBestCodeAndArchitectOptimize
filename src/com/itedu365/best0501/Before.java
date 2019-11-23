/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best0501;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  05、制定命名体系规约
 *
 *  重构01 —— 按照命名规约赋予名称
 *
 *  @author 颜廷吉
 */
public class Before {

	// 没有意义的成员变量
	static private String s;

	public static void method() {
		s = "365itedu";
		System.out.println(s);
	}

}
