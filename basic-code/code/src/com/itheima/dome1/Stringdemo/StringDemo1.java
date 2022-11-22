package com.itheima.dome1.Stringdemo;

/**
 * 字符串创建方式
 */
public class StringDemo1 {
    public static void main(String[] args) {
//        //1.使用直接赋值的方式获取一个字符串对象
//        String s1 = "abc";
//        System.out.println("abc");//abc
//
//        //2.使用new的方式获取一个字符串对象
//        //2.1 空参构造：可以获取一个空白字符串对象
//        String s2 = new String();
//        System.out.println("!"+s2 +"@");//!@
//        //2.2 传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
//        String s3 = new String("abc");
//        System.out.println("abc");//abc
//        //2.3 传递一个字符数组，根据数组内容在创建一个新的字符串对象
//        char [] chArr = {'a','b','c'};
//        String s4 = new String(chArr);
//        System.out.println(s4);//abc
//        //2.4 传递一个字节数组，根据数组内容再创建一个新的字符串对象
//        byte[] bArr =  {97,98,99};
//        String s5 = new String(bArr);
//        System.out.println(s5);//abc
//        char i =90;
//        System.out.println(i);
//        ```java
//        String str1 = "Abc";
//        if(str1.equals("abc")){
//            System.out.println("爱Java,爱生活~");
//        } else {
//            System.out.println("爱生活,爱Java~");
//        }
//```
//        char[] chs = {'h','e','l','l','o'};
//        String s1 = new String(chs);
//        String s2 = new String(chs);
//        String s3 = "hello";
//        String s4 = "hello";
////1
//        System.out.println((s1==s2)+","+(s1==s3)+","+(s3==s4));//fase,fase,true
////2
//        System.out.println((s1.equals(s2))+","+(s1.equals(s3))+","+(s3.equals(s4)));//true,true,true
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";
        String s4 = "a";
        String s5 = s4 + "bc";
        String s6 = "a" + "bc";
        //1
        System.out.println(s1.equals(s2)+" "+s1.equalsIgnoreCase(s3)+" "+s2.equals(s5)+" "+s3.equalsIgnoreCase(s5));//true true true true
        //2
        System.out.println((s1==s2)+" "+(s1==s3)+" "+(s2==s5)+" "+(s2==s6));//true false false true

    }
}
