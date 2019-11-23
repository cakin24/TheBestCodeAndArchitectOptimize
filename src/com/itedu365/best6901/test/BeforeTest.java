/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6901.test;

import com.itedu365.best6901.Person;

public class BeforeTest {
	public static void main(String[] args) {

		Person person = new Person("365itedu");
		System.out.println(person.washHands(person.getName()));
	}

}
