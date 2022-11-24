package polymorphic;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);
        Animal dog = new Dog(2,"黑色");
        Animal cat = new Cat(3,"灰色");
        String something1 = "骨头";
        String something2 = "鱼";
        p1.keepPet(dog,something1);
        p2.keepPet(cat,something2);


    }
}
