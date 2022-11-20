package com.itheima.dome1.test2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("华为",3299,"蓝色");
        Phone p2 = new Phone("小米",2000,"蓝色");
        Phone p3 = new Phone("魅族",1600,"蓝色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i].getPrice();
        }
        double avg = sum/ arr.length;
        System.out.println(avg);
    }
}
