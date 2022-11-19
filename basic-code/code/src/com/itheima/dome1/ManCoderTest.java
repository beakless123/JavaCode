package com.itheima.dome1;

public class ManCoderTest {
    public static void main(String[] args){
        Manager manager = new Manager("李华",123,15000,500);
        Coder coder = new Coder("张三",250,10000);
        manager.work();
        coder.work();
    }
}
