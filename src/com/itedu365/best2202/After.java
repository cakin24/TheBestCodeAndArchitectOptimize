/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  22、如何发挥正则表达式的威力
 *
 *  @author 颜廷吉
 */
public class After {

	/**
	* 正则表达式验证处理。
	* @param regEx 正则表达式格式
	* @param value 被验证字符串
	* @return 验证成功返回true，验证失败返回false。
	*/
	public static boolean validate(String regEx, Object value) {
		if (regEx != null && value != null) {
			Pattern pat = Pattern.compile(regEx);
			Matcher mat = pat.matcher(value.toString());
			if (!mat.find()) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

}
