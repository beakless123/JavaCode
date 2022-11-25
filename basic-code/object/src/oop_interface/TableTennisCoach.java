package oop_interface;

public class TableTennisCoach extends Person implements SpeakEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学说英语");
    }
}
