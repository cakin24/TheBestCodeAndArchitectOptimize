/*
 * Copyright (C) 2013～2014 365IT学院
 * www.365itedu.com
 * All Rights Reserved.
 */
package com.itedu365.best7702;

/**
 * 学生成绩等级处理业务类。
 * <p>
 * 等级分为三个：
 * <ul>
 *   <li>第一级、优秀。
 *   <li>第二级、合格。
 *   <li>第三级、不合格。
 * </ul>
 * @since V1.0
 * @author 颜廷吉
 * @version 版本1.0 2013.10.20
 */
public class After {

    /**
     * 根据类型取得成绩等级处理。
     * <p>
     * 等级：优秀、合格、不合格
     * @param type 参数类型
     * @return 等级名称
     */
    public static String getLevel(int type) {
        if (type == 1) {
            return "第一级：优秀";
        } else if (type == 2) {
            return "第二级：合格";
        } else {
            return "第三级：不合格";
        }
    }
}


