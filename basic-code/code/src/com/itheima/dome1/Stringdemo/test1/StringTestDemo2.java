package com.itheima.dome1.Stringdemo.test1;

import java.util.Scanner;

//请编写程序，由键盘录入一个字符串，把字符串中的所有字母都变成大写后输出,再把字符串中的所有字母变成小写后输出。
//比如：
//键盘录入字符串:Hello12345World~!#$
//控制台输出:
//转换后的大写字符串: HELLO12345WORLD~!#$
//转换后的小写字符串: hello12345world~!#$
//要求:
//1.定义方法myToUpperCase,完成把方法参数字符串转换成大写字符串并返回转换后的结果
//2.定义方法myToLowerCase,完成把方法参数字符串转换成小写字符串并返回转换后的结果
//3.获取键盘录入的字符串后,分别调用以上两个方法,获取结果字符串并输出
public class StringTestDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String strToUpper = myToUpperCase(str);
        System.out.println("转换后的大写字符串: "+strToUpper);
        String strToLower = myToLowerCase(strToUpper);
        System.out.println("转换后的小写字符串: "+strToLower);
    }
    public static String myToUpperCase(String str){
        char[] arr = new char[str.length()];
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                sb = sb.append((char) (str.charAt(i)-32));
            }else {
                sb = sb.append(str.charAt(i));
            }

        }
        String strRe = sb.toString();
        return strRe;
    }
    public static String myToLowerCase(String str){
        char[] arr = new char[str.length()];
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                sb = sb.append((char) (str.charAt(i)+32));
            }else {
                sb = sb.append(str.charAt(i));
            }

        }
        String strRe = sb.toString();
        return strRe;
    }
}
