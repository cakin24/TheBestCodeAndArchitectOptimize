/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best7412.action;

import com.itedu365.best6301.Form;
import com.itedu365.best7411.service.UpdateService;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  74、如何保持包的清晰
 *
 *  重构28 —— 规整包中类位置
 *
 *  @author 颜廷吉
 */
public class MyAction {
    // 组合方式：页面项目容器VO
    private Form form = new Form();
    // 组合方式：数据库访问层类
    UpdateService updateService = new UpdateService();

    // Control控制层
    public String update() {
        // 获取数据库值
        String flag = updateService.getDBData(form.getName());
        if ("1".equals(flag)) {
            System.out.println("得到正确数据！");
        } else {
            System.out.println("得到错误数据！");
        }
        return "success";
    }
}
