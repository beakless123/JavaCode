package polymorphic;

public class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal,String something){
        String animalKind = "";
        if(animal instanceof Dog){
            animalKind = "狗";
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+animal.getColor()+"的"+animal.getAge()+"岁的"+animalKind);
            System.out.println(animal.getAge()+"岁的"+animal.getColor()+"的"+animalKind+"两只前腿死死的抱住骨头猛吃");
            Dog d = (Dog) animal;
            d.lookHome();
        }else if(animal instanceof Cat){
            animalKind = "猫";
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+animal.getColor()+"的"+animal.getAge()+"岁的"+animalKind);
            System.out.println(animal.getAge()+"岁的"+animal.getColor()+"的"+animalKind+"眯着眼侧着头吃鱼");
            Cat c = (Cat) animal;
            c.catchMouse();
        }


    }
}
