package com.hspedu.regexp;

import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 11:45
 * @Version 1.0
 */
public class PatterMethod {
    public static void main(String[] args) {
        String content = "hello abc hello 韩顺平教育";
        //String regStr = "hello";
        String regStr = "hello.*";
        boolean matches = Pattern.matches(regStr, content);
        System.out.println("整体匹配=" + matches);
    }
}
