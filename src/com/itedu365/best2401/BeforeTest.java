/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2401;

import java.util.HashSet;

public class BeforeTest {
	public static void main(String[] args) {
		HashSet<Before> hashSet = new HashSet<Before>();
		// 生成临时变量1
		Before befor1 = new Before("365itedu", (short) 3);
		// 生成临时变量2（内容与临时变量1一样）
		Before befor2 = new Before("365itedu", (short) 3);
		hashSet.add(befor1);
		hashSet.add(befor2);
		System.out.println(hashSet);
	}
}
