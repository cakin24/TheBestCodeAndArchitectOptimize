/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best3902;

public class AfterTest {
	public static void main(String[] args) {
		After r1 = new After();
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		t1.start();
		t2.start();
	}
}
