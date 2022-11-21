package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        //2.统计字符串中大小写字母的个数
        int da = 0;
        int xiao = 0;
        int shu = 0;
        int fei = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>=65 && c<91){
                da+=1;
            } else if (c>=97 && c<123) {
                xiao+=1;
            } else if (c>=48 && c<=57){
                shu+=1;
            }else {
                fei+=1;
            }
        }
        System.out.println("大写字母字符个数为："+da);
        System.out.println("小写字母字符个数为："+xiao);
        System.out.println("数字字符个数为："+shu);
        System.out.println("非字母数字字符个数为："+fei);
    }
}
