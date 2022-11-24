package inherit.demo01;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("teacher正在工作。。。");
    }
}
