package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 9:45
 * @Version 1.0
 */
public class RegExp04 {
    public static void main(String[] args) {
        
        String content = "hanshunping韩 寒冷";
        String regStr = "han|韩|寒";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
