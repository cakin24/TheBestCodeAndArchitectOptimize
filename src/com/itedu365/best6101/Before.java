/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6101;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * 【Java代码与架构之完美优化——实战经典】
 *
 *  61、在文件操作后要进行清理动作
 *
 *  @author 颜廷吉
 */
public class Before {
    // 读取C盘下test.txt文件
    public static void method() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("C:\\test.txt");
            br = new BufferedReader(fr);
            String line = br.readLine();
            // 输出文件内容
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
