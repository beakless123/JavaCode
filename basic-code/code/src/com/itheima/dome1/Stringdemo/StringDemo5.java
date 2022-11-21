package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

/**
 * 遍历字符串
 */
public class StringDemo5 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        //2.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }

}
