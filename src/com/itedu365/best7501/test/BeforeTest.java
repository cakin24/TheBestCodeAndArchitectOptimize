/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */
package com.itedu365.best7501.test;

import com.itedu365.best7501.Service;
import com.itedu365.best7501.UpdateService;

public class BeforeTest {
    public static void main(String[] args) {
        Service updateService = new UpdateService();
        System.out.println(updateService.executeService());
    }
}
