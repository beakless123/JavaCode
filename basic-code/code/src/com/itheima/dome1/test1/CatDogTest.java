package com.itheima.dome1.test1;

public class CatDogTest {
    public static void main(String[] args) {
        Cat cat = new Cat("橘色","橘猫");
        Dog dog = new Dog("黄色","大黄狗");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
