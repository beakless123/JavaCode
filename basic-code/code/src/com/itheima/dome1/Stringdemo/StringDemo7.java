package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

/**
 * 字符串拼接和反转
 */
//定义一个方法，把 int数组中的数据按照指定的格式拼接成一个字符串返回,
//调用该方法，并在控制台输出结果。
//例如:
//  数组为int[]arr = {1,2,3};
//  执行方法后的输出结果为:[1,2,31]

//定义一个方法，实现字符串反转。
//键盘录入一个字符串，调用该方法后，在控制台输出结果
// 例如，键盘录入abc，输出结果cba

public class StringDemo7 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        String str = stringJoin(arr);
//        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        String strRev = stringReversal(str);
        System.out.println(strRev);
    }
    public static String stringJoin(int[] arr){
        if (arr==null){
            return "";
        } else if (arr.length==0) {
            return "[]";
        } else {
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                str = str + arr[i];
                if(i< arr.length-1){
                    str = str +", ";
                }
                if (i == arr.length-1){
                    str = str +"]";
                }
            }
            return str;
        }
    }
    public static String stringReversal(String str){
        String strRev = "";
        for (int i = str.length()-1; i >=0; i--) {
            strRev = strRev + str.charAt(i);
        }
        return strRev;
    }
}
