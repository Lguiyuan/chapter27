package com.hspedu.regexp;

/**
 * @Author lgy
 * @Date 2022/8/13 13:10
 * @Version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        String content = "hsp@souhu.com";
        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[A-Za-z]+$";
        if (content.matches(regStr)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
        
        
    }
}
