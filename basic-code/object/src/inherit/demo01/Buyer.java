package inherit.demo01;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Buyer正在采购教学用品...");
    }
}
