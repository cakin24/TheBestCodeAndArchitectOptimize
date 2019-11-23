/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2402;

import java.util.HashSet;

public class AfterTest {
	public static void main(String[] args) {
		HashSet<After> hashSet = new HashSet<After>();
		// 生成临时变量1
		After after1 = new After("365itedu", (short) 3);
		// 生成临时变量2（内容与临时变量1一样）
		After after2 = new After("365itedu", (short) 3);
		hashSet.add(after1);
		hashSet.add(after2);
		System.out.println(hashSet);
	}
}
