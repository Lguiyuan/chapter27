package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 9:14
 * @Version 1.0
 */
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(a.bc(123(";
        //匹配（^^^
        //String reStr = "a.c";
        //String reStr = "\\d\\d\\d";
        String reStr = "\\d{3}";
        Pattern pattern = Pattern.compile(reStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到" + matcher.group(0));
        }
    
    }
}
