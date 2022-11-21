package com.itheima.dome1.Stringdemo;

import java.util.Scanner;

/**
 * 需求:已知正确的用户名和密码,请用程序实现模拟用户登录。
 * 总共给三次机会，登录之后，给出相应的提示
 */
public class StringDemo4 {
    public static void main(String[] args) {
//        //1、定义正确的用户名和密码
        String cName = "zhangsan";
        String cPassword = "123456";
//        //2、模拟用户输入用户名和密码，比较内容
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String uName = sc.next();
            System.out.println("请输入密码：");
            String uPassWord = sc.next();
            boolean flagN = cName.equals(uName);
            boolean flagP = cPassword.equals(uPassWord);
            if(flagN && flagP){
                System.out.println("登录成功！");
                break;
            }else {
                if (i==2){
                    System.out.println("用户名或密码错误,你的账号已被封锁！");
                }else {
                    System.out.println("用户名或密码错误!你还有"+(2-i)+"次机会!");
                }
            }
        }
    }
}
