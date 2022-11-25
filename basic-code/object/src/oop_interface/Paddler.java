package oop_interface;

public class Paddler extends Person implements SpeakEnglish{
    public Paddler() {
    }

    public Paddler(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("乒乓球运动员在学打乒乓球");
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在学说英语");
    }
}
