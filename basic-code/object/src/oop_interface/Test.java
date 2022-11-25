package oop_interface;

public class Test {

    public static void main(String[] args) {

        Paddler paddler = new Paddler("张三",18);
        Basketballer basketballer =new Basketballer("李四",19);
        paddler.work();
        paddler.speakEnglish();
        basketballer.work();
    }



}
