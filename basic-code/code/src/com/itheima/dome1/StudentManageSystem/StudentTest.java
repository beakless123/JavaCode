package com.itheima.dome1.StudentManageSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentTest {
    public static void startStudentTest() {
        ArrayList<Student> studentList = new ArrayList<>();
        Student s1 = new Student( "001","张三", 18, "布吉岛");
        studentList.add(s1);
        Scanner sc = new Scanner(System.in);
        loop:while (true){
            System.out.println("----------------欢迎来到学生管理系统-----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            switch (choose){
                case "1"-> {
                    Student student = new Student();
                    System.out.println("请输入要添加的学生的id：");
                    student.setId(sc.next());
                    System.out.println("请输入要添加的学生的姓名：");
                    student.setName(sc.next());
                    System.out.println("请输入要添加的学生的年龄：");
                    student.setAge(sc.nextInt());
                    System.out.println("请输入要添加的学生的家庭住址：");
                    student.setAddress(sc.next());
                    addStudent(studentList,student);
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                }
                case "2"-> {
                    System.out.println("请输入要删除学生的id：");
                    String id = sc.next();
                    delStudent(studentList,id);
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                }
                case "3"-> {
                    System.out.println("请输入要修改的学生的id：");
                    String id = sc.next();
                    alterStudent(studentList,id);
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                }
                case "4"-> {
                    queryStudent(studentList);
                    break loop;
                }
                case "5"-> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void addStudent(ArrayList<Student> studentList , Student student){
        int count = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals( student.getId())){
                System.out.println("添加失败！学生id重复，返回主菜单");
                break;
            }else {
                count += 1;
            }
        }
        if (count == studentList.size()){
            studentList.add(student);
            System.out.println("添加成功!返回主菜单");
        }
    }
    public static void delStudent(ArrayList<Student> studentList , String id){
        int count = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals(id)){
                studentList.remove(i);
                System.out.println("删除成功！返回主菜单");
                count = -1;
                break;
            }else {
                count+=1;
            }
        }
        if (count == studentList.size()) {
            System.out.println("删除失败！id不存在，返回主菜单");
        }
    }
    public static void alterStudent(ArrayList<Student> studentList , String id){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals(id)){
                System.out.println("请输入修改后的学生姓名：");
                String alterName = sc.next();
                studentList.get(i).setName(alterName);
                System.out.println("请输入修改后的学生年龄：");
                int alterAge = sc.nextInt();
                studentList.get(i).setAge(alterAge);
                System.out.println("请输入修改后的学生家庭住址：");
                String alterAddress = sc.next();
                studentList.get(i).setAddress(alterAddress);
                break;
            }else {
                count+=1;
            }
        }
        if (count == studentList.size()) {
            System.out.println("修改失败！id不存在，返回主菜单");
        }
    }
    public static void queryStudent(ArrayList<Student> studentList ){
        if (studentList.size()==0){
            System.out.println("当前无学生信息，请添加后查询");
        }else {
            System.out.println("id      姓名      年龄      家庭住址");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i).getId()+"\t\t"+studentList.get(i).getName()+"\t  "+studentList.get(i).getAge()+"\t\t"+studentList.get(i).getAddress());
            }
        }
    }
}
