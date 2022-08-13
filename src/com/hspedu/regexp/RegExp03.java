package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 9:25
 * @Version 1.0
 * 演示字符匹配符的使用
 */
public class RegExp03 {
    public static void main(String[] args) {
        String content = "a11c8ab _cABC@";
        //String regStr = "[A-Z]";
        //String regStr = "[0-9]";
        //String regStr = "(?i)abc";
        //String regStr = "[^0-9]";
        //String regStr = "[abcd]";
        //String regStr = "\\D";
        //String regStr = "\\w";
       // String regStr = "\\W";
        //String regStr = "\\s";
        //String regStr = "\\S";
        String regStr = ".";
        
        
        
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到 " + matcher.group(0));
        }
    
    }
}
