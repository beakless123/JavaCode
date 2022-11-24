package polymorphic;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("宠物狗正在吃"+something);
    }
    public void lookHome(){
        System.out.println("宠物狗正在看家");
    }
}
