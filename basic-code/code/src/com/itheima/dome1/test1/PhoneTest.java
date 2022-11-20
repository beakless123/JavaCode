package com.itheima.dome1.test1;

import com.itheima.dome1.test1.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        String brand = "小米";
        double price = 3999.99;
        String color = "红色";
        Phone phone = new Phone(brand,price,color);
        phone.call();
        phone.sendMessages();
    }
}
