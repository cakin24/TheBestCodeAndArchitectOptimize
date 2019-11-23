package com.itedu365.best7701;
/**
 * 业务类。
 * 学生成绩等级处理业务类。
 *  修改履历
 *  修改日期         修改者   修改类型             修改概要
 *  2013.10.01  张三       New           第一版本
 *  2013.10.15  李四       CHG-0001      增加不合格类型
 *  2013.12.22  王五       BUG-0001      类型名称修改
 */
public class Before {
    /**
     * 取得产品优秀与合格等级方法。
     * 用if-else这种处理方法应该比较好的。
     * @param type
     * @return
     */
    public static String getLevel(int type) {
        if (type == 1) {
            return "第一级：优秀";
        } else if (type == 2) {
            return "第二级：合格";
        // CHG-0001 2013.10.15 START
        // }
        } else {
            // BUG-0001 2013.12.22 START
            // return "第三级：不及格";
            return "第三级：不合格";
           // BUG-0001 2013.12.22 END
        }
        // CHG-0001 2013.10.15 END
    }
}

