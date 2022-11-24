package inherit.demo01;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("Lecturer正讲课。。。");
    }
}
