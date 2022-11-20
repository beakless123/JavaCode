package com.itheima.dome1.test2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输入汽车的品牌：");
            String brand = scanner.next();
            car.setBrand(brand);
            System.out.println("请输入汽车的价格：");
            double price = scanner.nextDouble();
            car.setPrice(price);
            System.out.println("请输入汽车的颜色：");
            String color = scanner.next();
            car.setColor(color);
            arr[i] = car;
        }
        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            System.out.println(c.getBrand()+","+c.getPrice()+","+c.getColor());
        }
    }
}
