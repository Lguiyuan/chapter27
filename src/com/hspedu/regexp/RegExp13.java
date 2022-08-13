package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 12:46
 * @Version 1.0
 */
public class RegExp13 {
    public static void main(String[] args) {
        String content = "我....我要....学学学学...编程java！";
        
        //1.去掉所有的.
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
    
        System.out.println(content);
    
        
        //2.去掉重复的字 我我要学学学学编程java！
        // 思路
        //（1） 使用(.)\\1+
//        pattern = Pattern.compile("(.)\\1+");
//        matcher = pattern.matcher(content);
//        while (matcher.find()){
//            System.out.println("找到=" + matcher.group(0));
//        }
//
//        content = matcher.replaceAll("$1");
//        System.out.println(content);
        
        //3.
        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
    
        System.out.println(content);
    }
}
