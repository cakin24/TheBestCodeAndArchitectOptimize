/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1812;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  18、避免使用复杂条件式或分支
 *
 *  重构07 —— 用卫语句代替嵌套条件表达式
 *
 *  @author 颜廷吉
 */
public class After {
	public static int getInsurance(String type) {
		//死亡
		if ("1".equals(type)) {
			return 1000000;
		}
		//失业
		if ("2".equals(type)) {
			return 50000;
		}
		//辞职
		if ("3".equals(type)) {
			return 10000;
		}
		return 0;
	}
}
