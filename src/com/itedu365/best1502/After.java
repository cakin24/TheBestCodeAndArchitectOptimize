/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best1502;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  15、用Bigdecimal类型进行精确计算
 *
 *  @author 颜廷吉
 */
public class After {
	public static void method() {
		BigDecimal b1 = new BigDecimal(99.00);
		BigDecimal b2 = new BigDecimal(88.90);
		NumberFormat nf = new DecimalFormat("#.##");
		System.out.println(nf.format(b1.subtract(b2)));
	}

}
