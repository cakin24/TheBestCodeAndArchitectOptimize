/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2101;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  20、如何正确使用配符的边界
 *
 *  @author 颜廷吉
 */
public class BeforeWrite {
	public static void method() {
		write(new ArrayList<Number>());
	}

	// 通用方法：向集合里写入数字型数据
	public static void write(List<? super Number> list) {
		// 添加Double型
		list.add(Double.valueOf(1.1));
		// 添加Integer型
		list.add(Integer.valueOf(2));
		System.out.println(list);
	}
}
