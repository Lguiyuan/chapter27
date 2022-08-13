package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 12:36
 * @Version 1.0
 */
public class RegExp12 {
    public static void main(String[] args) {
        
        String content = "h5225ell11512321-333999111514o jack 11maryy xx111111111x yy22y ccc world";
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到  " + matcher.group(0));
        }
    }
}
