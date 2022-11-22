package com.itheima.dome1.Stringdemo.test1;

import java.util.Scanner;

//#### 1:需求
//        请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
//        例如："abcba"、"上海自来水来自海上"均为对称字符串。
public class StringTestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        boolean flag = symJudge(str);
        if(flag){
            System.out.printf(str+"是对称字符串");
        }else {
            System.out.println(str+"不是对称字符串");
        }

    }
    public static boolean symJudge(String str){
        StringBuilder sb = new StringBuilder(str);
        String strJudge = sb.reverse().toString();
        return strJudge.equals(str);
    }
}
