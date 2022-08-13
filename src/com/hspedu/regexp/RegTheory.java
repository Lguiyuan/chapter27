package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/12 20:00
 * @Version 1.0
 * 分析java的正则表达式的底层实现
 */
public class RegTheory {
    public static void main(String[] args) {
        String content = "1998 年 12 月 8 日，第二代 Java 平台的企业版 J2EE 发布。1999 年 6 月，Sun 公司发布了" +
                "第二代 Java 平台（简称为 Java2）的 3 个版本：J2ME（Java2 Micro Edition，Java2 平台的微型" +
                "版），应用于移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2 平台的" +
                "标准版），应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2 平台的企业版），应" +
                "用 3443 于基于 Java 的应用服务器。Java 2 平台的发布，是 Java 发展过程中最重要的一个" +
                "里程碑，标志着 Java 的应用开始普及 9889 ";
        //目标：匹配所有四个数字
        //说明
        //1.\\d 表示一个任意数字
        String regString = "(\\d\\d)(\\d\\d)";
        //2. 创建模式对象
        //2.创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regString);
        //3.创建匹配器
        // 说明： 创建匹配器matcher，按照正则表达式的规则，去匹配content字符串
        Matcher matcher = pattern.matcher(content);
        
        //4.开始匹配
        /**
         * marcher.find()完成的任务
         *1.根据指定的规则，来定位满足规则的子字符串（比如：1998）
         * 2.找到后，将字符串开始的索引记录到matcher对象的属性 int[] groups;
         *    groups[0] = 0, 把该子字符串的结束的索引+1的值记录到
         *
         */
        while (matcher.find()){
            System.out.println("找到：" + matcher.group(0));
            System.out.println("第一组()匹配到的值" + matcher.group(1));
            System.out.println("第二组()匹配到的值" + matcher.group(2));
        }
        
    
    }
}
