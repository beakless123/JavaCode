package inherit.demo01;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Maintainer正在维护教学系统。。。");
    }
}
