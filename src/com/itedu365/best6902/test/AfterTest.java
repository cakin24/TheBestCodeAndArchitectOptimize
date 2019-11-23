/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6902.test;

import com.itedu365.best6911.Person;
import com.itedu365.best6911.SqlMapClientTemplate;

public class AfterTest {
	public static void main(String[] args) {

		SqlMapClientTemplate sqlMapTemp = SqlMapClientTemplate.getSqlMapClientTemplate();
		Object obj = sqlMapTemp.queryForObject("SQL001");
		Person person = (Person) obj;
		System.out.println(person.getName());

	}

}
