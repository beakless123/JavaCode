package inherit.demo01;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("adminStaff正在工作。。。");
    }
}
