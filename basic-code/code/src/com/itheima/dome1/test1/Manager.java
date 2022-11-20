package com.itheima.dome1.test1;
//定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
//定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
//要求：
//1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
//2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
//3.调用成员方法,打印格式如下:
// ```
// 工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
// 工号为135基本工资为10000的程序员正在努力的写着代码......
// ```
public class Manager {
    private String name;
    private int id;
    private double salary;
    private double bonu;

    public Manager() {}
    public Manager(String name, int id, double salary, double bonu) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonu = bonu;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return bonu
     */
    public double getBonu() {
        return bonu;
    }

    /**
     * 设置
     * @param bonu
     */
    public void setBonu(double bonu) {
        this.bonu = bonu;
    }

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonu+"的"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
