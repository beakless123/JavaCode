package com.itheima.dome1.Stringdemo;

/**
 * 字符串内容比较
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //1.boolean equals() 内容完全相同
        String s1 = "abd";
        String s2 = new String("abd");
        System.out.println(s1==s2);//false比较地址值
        boolean c = s1.equals(s2);
        System.out.println(c);//true比较内容

        //2.boolean equalsIgnoreCase() 忽略大小写
        String s3 = new String("AbD");
        boolean c1 = s1.equals(s3);
        System.out.println(c1);//false
        boolean c2 = s1.equalsIgnoreCase(s3);
        System.out.println(c2);//true

    }
}
