/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best7502.org.service;

import com.itedu365.best7502.frameword.Service;
/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  75、如何抽出框架层次
 *
 *  @author 颜廷吉
 */
public class UpdateService implements Service {
    // 业务逻辑方法
    @Override
    public String executeService() {
        return  "数据取得";
    }
}
