/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best7412.test;

import com.itedu365.best7411.action.MyAction;

/**
*
* 【Java最佳编程实践66例】
*
*  64、如何保持包的清晰
*
*  重构27 —— 规整包中类位置
*
*/
public class AfterTest {
	public static void main(String[] args) {
		MyAction myaction = new MyAction();
		System.out.println(myaction.update());
	}
}
