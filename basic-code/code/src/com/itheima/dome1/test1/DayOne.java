package com.itheima.dome1.test1;

import java.util.ArrayList;

public class DayOne {
//    public static void main(String[] args) {
//        System.out.println("~~~java\n" +
//                "java是一门跨平台的计算机语言\n" +
//                "被称为一次编写，处处运行\n" +
//                "~~~");

//        String name ="张三";
//        char gender = '男';
//        int age = 18;
//        double higth = 1.78;
//        boolean marry = false;
//        System.out.println("~~~java");
//        System.out.println(name);
//        System.out.println(gender);
//        System.out.println(age);
//        System.out.println(higth);
//        System.out.println(marry);
//        System.out.println("~~~");

//        byte b = 127;
//        short s = 250;
//        int i = 500;
//        long l =10000000000L;
//        float f =3.14F;
//        double d = 9.30;
//        char c = 'z';
//        boolean bl = true;
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(c);
//        System.out.println(bl);

//        int a=10;
//        int b=20;
//        System.out.println("10+20="+(a+b));
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("1");
        for(int i = 0;i<list.size();i++) {
            if(list.get(i).length()>1) {
                list.remove(i);
            }
        }
        System.out.println(list);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("b");
//        list.add("b");
////        for (int i = 0; i < list.size(); i++) {
////            if (list.get(i).equals("b")) {
////                list.remove(i);
////            }
////        }
//        list.remove ("b");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
}
