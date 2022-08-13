package com.hspedu.regexp;

/**
 * @Author lgy
 * @Date 2022/8/13 13:23
 * @Version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        
        
        String content = "1.1";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";
        if(content.matches(regStr)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }
}
