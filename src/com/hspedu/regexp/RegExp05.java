package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 9:53
 * @Version 1.0
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content = "a2111111aaaaaahello";
        //String regStr = "\\d{2}";//表示匹配aaa
    
        //String regStr = "a{3,4}";//表示要匹配aaa 或者aaaa
        //String regStr = "a+";
        //String regStr = "1*";
        String regStr = "a1?";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("匹配到 " + matcher.group(0));
        }
    
    
    }
}
