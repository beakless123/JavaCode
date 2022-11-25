package oop_interface;

public class Basketballer extends Person{
    public Basketballer() {
    }

    public Basketballer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学打篮球");
    }
}
