package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = scanner.next();//new出来的
        //2.直接赋值定义一个字符串
        String s2 = "abc";
        //3.用==比较
        System.out.println(s1==s2);//false
    }
}
