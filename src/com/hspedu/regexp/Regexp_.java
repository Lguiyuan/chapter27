package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author lgy
 * @Date 2022/8/12 19:36
 * @Version 1.0
 * 体验正则表达式的威力，给我们文本带来哪些遍历
 *
 */
public class Regexp_ {
    public static void main(String[] args) {
        
        //假定爬虫获得页面
//        String content = "1995年，互联网的蓬勃发展给了Oak机会。业界为了使死板、" +
//                "单调的静态网页能够“灵活”起来，急需一种软件技术来开发一种程序，" +
//                "这种程序可以通过网络传播并且能够跨平台运行。于是，" +
//                "世界各大IT企业为此纷纷投入了大量的人力、物力和财力。" +
//                "这个时候，Sun公司想起了那个被搁置起来很久的Oak，" +
//                "并且重新审视了那个用软件编写的试验平台，" +
//                "由于它是按照嵌入式系统硬件平台体系结构进行编写的" +
//                "，所以非常小，特别适用于网络上的传输系统，" +
//                "而Oak也是一种精简的语言，程序非常小，适合在网络上传输。" +
//                "Sun公司首先推出了可以嵌入网页并且可以随同网页在网络上传输的Applet（Applet是一种将小程序嵌入到网页中进行执行的技术），" +
//                "并将Oak更名为Java。5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器。" +
//                "IBM、Apple、DEC、Adobe、HP、Oracle、Netscape和微软等各大公司都纷纷停止了自己的相关开发项目，" +
//                "竞相购买了Java使用许可证，并为自己的产品开发了相应的Java平台。 [9-10] ";
        String content = "私有地址（Private address）属于非注册地址，专门为组织机构内部使用。\n" +
                "以下列出留用的内部私有地址\n" +
                "A类 10.0.0.0--10.255.255.255\n" +
                "B类 172.16.0.0--172.31.255.255\n" +
                "C类 192.168.0.0--192.168.255.255";
        
        
        //提取文章中所有的英文单词
        //(1).传统方法.使用遍历方式 代码量大 效率不高
        //(2).正则表达式技术
        
        //1.先创建一个Pattern对象，模式对象，可以理解成就是一个正则表达式对象
        //Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //Pattern pattern = Pattern.compile("[0-9]+");
        //Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        Pattern pattern = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+");
        //2.创建一个匹配器对象
        //理解：就是matcher 匹配器按照 pattern(模式/样式)，到content 文本中取匹配
        //找到就返回true，否则就返回false
        Matcher matcher = pattern.matcher(content);
        //3.可以开始循环匹配
        while (matcher.find()){
            //匹配内容，文本，放到m.group(0)
            System.out.println("找到："+matcher.group(0));
        }
    
    
    }
}
