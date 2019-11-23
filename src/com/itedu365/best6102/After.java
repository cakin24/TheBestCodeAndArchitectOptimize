/*
 * 本书配套视频教程网址（架构师系列培训）:
 *         www.365itedu.com
 * 365IT学院，让学习变得更简单！
 */

package com.itedu365.best6102;

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
public class After {
       // 读取C盘下test.txt文件
    public static void method() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // 1.打开FileReader
            fr = new FileReader("C:\\test.txt");
            // 2.打开BufferedReader
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
        } finally {
            // 与打开资源顺序逆方向关闭资源
            try {
                // 3.关闭BufferedReader
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // 4.关闭FileReader
                if (fr != null) {
                    try {
                        fr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
