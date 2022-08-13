package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/13 11:28
 * @Version 1.0
 */
public class RegExp11 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV1fh411y7R8?p=894&spm_id_from=pageDriver&vd_source=f4d928eed95a3ab047debbbb64999e0f";
        /**
         * 思路
         * 1.先确定url 的开始部分 https://  | http://
         */
        String regStr = "(^(http|https)://)([\\w-]+\\.)";
    
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
    
        if (matcher.find()){
        
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
