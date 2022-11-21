package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

/**
 * 数字转换成中文大写金额
 * 例如：5324转换成 零佰零拾零万伍仟叁佰贰拾四圆
 */
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = scanner.nextInt();
        while (true) {
            if (num < 0 || num > 9999999) {
                System.out.println("金额超出范围，请重新输入：");
                num = scanner.nextInt();
            }else {
                break;
            }
        }
        String str = numToString(num);
//        System.out.println(str);
        String strRe = insertUnit(str);
        System.out.println(strRe);
    }
    //1.数字转中文
    public static String numToString(int num){
        String strNum = "";                                                     //存放字符串数字
        String[] arrTable = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};  //制表
        //数字转换为字符串
        while (true){       //主要是获取数字长度
            int n = num % 10;
            num = num / 10;
            strNum = n + strNum ;
            if (num == 0){
                break;
            }
        }
        int[] arrIndex = new int[strNum.length()];                              //存放表索引
        for (int i = 0; i < strNum.length(); i++) {
            arrIndex[i] = strNum.charAt(i)-48;                                  //字符转数字
//            System.out.println(arrIndex[i]);
        }
        String str = "";                                                        //存放目标字符串
        for (int i = 0; i < arrIndex.length; i++) {                             //查表生成字符串
            str = str + arrTable[arrIndex[i]];
        }
        int count = 7 - str.length();
        for (int i = 0; i < count; i++) {
            str = "零"+str;
        }
        return str;

    }
    //2.插入单位
    public static String insertUnit(String str){
        String[] arrUnit = {"佰","拾","万","仟","佰","拾","圆"};
        String strRe = "";
        for (int i = 0; i < arrUnit.length; i++) {
            strRe = strRe + str.charAt(i) + arrUnit[i];
        }
        return strRe;
    }
}
