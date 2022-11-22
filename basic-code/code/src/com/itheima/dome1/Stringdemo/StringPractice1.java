package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

/**
 * 输入一个字符串，每个数字字符转化为罗马数字
 * 只能输入数字
 */
public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String strNum = scanner.next();
        //判断是否全为数字
        for (int i = 0; i < strNum.length(); i++) {
            if(strNum.charAt(i)<48||strNum.charAt(i)>57){
                System.out.println("输入错误，请重新输入一串数字");
                strNum =scanner.next();
            }

        }
        String str = strToLuoMa(strNum);
        System.out.println(str);
    }
    public static String strToLuoMa(String strNum){
        String[] arrLuoMa = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < strNum.length(); i++) {
            sb.append(arrLuoMa[strNum.charAt(i)-48]);
        }
        String str = sb.toString();
        return str;
    }

}
