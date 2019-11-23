/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best5502;

public class AfterTest {
	public static void main(String[] args) {
		try {
			After.getErrorCode(1);
		} catch (Itedu365Exception1 e) {
			System.out.println(e.getErrorCode() + " 这里是扩展的业务异常1! ");
		} catch (Itedu365Exception2 e) {
			System.out.println(e.getErrorCode() + " 这里是扩展的业务异常2! ");
		}
	}
}
