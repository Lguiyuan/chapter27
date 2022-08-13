package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 10:25
 * @Version 1.0
 */
public class RegExp07 {
    public static void main(String[] args) {
        
        String content = "hanshunping s7789 nn18456han";
        //String regStr = "(\\d\\d)(\\d)(\\d)";
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d)(\\d)";
        
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        
        while (matcher.find()){
            System.out.println("找到=" + matcher.group(0));
            System.out.println("第一个分组的内容" + matcher.group(1));
            System.out.println("第一个分组的内容[通过组名]" + matcher.group("g1"));
            System.out.println("第二个分组的内容" + matcher.group(2));
            System.out.println("第三个分组的内容" + matcher.group(3));
        }
    
    }
}
