package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 10:12
 * @Version 1.0
 */
public class RegExp06 {
    public static void main(String[] args) {
        
        String content = "hanshunping sphan nnhan";
        //String content = "123-a";
        //String regStr = "^[0-9]+[a-z]*";
        //String regStr = "^[0-9]+\\-[a-z]+$";
        String regStr = "han\\B";
    
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        
        while (matcher.find()){
            System.out.println("找到=" + matcher.group(0));
        }
    
    }
}
