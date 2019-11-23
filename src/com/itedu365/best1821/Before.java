/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1821;

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
public class Before {
	public static String eatMethod(Integer type) {
		if (Consts.FRUITS_APPLE == type) {
			return "苹果削皮吃！";
		} else if (Consts.FRUITS_BANANA == type) {
			return "香蕉剥皮吃！";
		}
		return "";
	}

}
