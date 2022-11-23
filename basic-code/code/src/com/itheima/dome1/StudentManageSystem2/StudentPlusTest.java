package com.itheima.dome1.StudentManageSystem2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentPlusTest {
    public static void main(String[] args) {
        ArrayList<StudentPlus> userList = new ArrayList<>();
        StudentPlus sp1 = new StudentPlus("zhangsan","123456","450821199711252512","15623906675");
        userList.add(sp1);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作 1登录 2注册 3忘记密码");
            String choose = sc.next();
            switch (choose){
                case "1"-> {
                    System.out.println("登录");
                    singIn(userList);
                }
                case "2"-> {
                    System.out.println("注册");
                    singUp(userList);
                    for (int i = 0; i < userList.size(); i++) {
                        System.out.println(userList.get(i));
                    }
                }
                case "3"-> {
                    System.out.println("忘记密码");
                    forgetPassword(userList);
                }
                default -> System.out.println("没有这个选项，请重新选择");
            }
        }
    }
    public static void singIn(ArrayList<StudentPlus> list){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            String name = sc.next();
            int index = getIndex(list,name);
            if(index>=0){
                System.out.println("请输入密码");
                String pass = sc.next();
                String cNum = creatCheckNum();
                System.out.println("验证码为："+ cNum);
                System.out.println("请输入验证码：");
                String num = sc.next();
                if(num.equalsIgnoreCase(cNum)){
                    System.out.println("验证码通过");
                    for (int i = 0; i < 3; i++) {
                        if(list.get(index).getPassword().equals(pass)){
                            System.out.println("登录成功");
                            return;
                        }else {
                            if (i==2){
                                System.out.println("密码输入错误，账户"+list.get(index).getUserName()+"已锁定！请联系客服解锁");
                                return;
                            }
                            System.out.println("密码输入错误，还有"+(2-i)+"次机会");
                            System.out.println("请输入密码");
                            pass = sc.next();
                        }
                    }
                }else {
                    System.out.println("验证码错误，请重新输入");

                }
            }else {
                System.out.println("用户名未注册，请先注册");
                return;
            }
        }

    }
    public static void singUp(ArrayList<StudentPlus> list){
        StudentPlus sp = new StudentPlus();
        String userName = checkUserName(list);
        String password = checkPassword();
        String identity = checkIdentity();
        String phone = checkPhone();
        sp.setUserName(userName);
        sp.setPassword(password);
        sp.setIdentity(identity);
        sp.setPhone(phone);
        list.add(sp);
        System.out.println("注册成功！");
    }
    public static void forgetPassword(ArrayList<StudentPlus> list){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            String name = sc.next();
            int index = getIndex(list,name);
            if(index>=0){
                System.out.println("请输入身份证号码");
                String id = sc.next();
                System.out.println("请输入电话号码");
                String phone = sc.next();
                if(list.get(index).getIdentity().equals(id) && list.get(index).getPhone().equals(phone)){
                    System.out.println("请输入新的密码：");
                    String pass = sc.next();
                    list.get(index).setPassword(pass);
                    System.out.println("密码修改成功");
                    return;
                }else {
                    System.out.println("账号信息不匹配，修改失败");
                    return;
                }
            }else {
                System.out.println("用户名未注册");
                return;
            }
        }
    }
    public static boolean strIsAllNum(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }

        }
        return true;
    }
    public static int getIndex(ArrayList<StudentPlus> list, String str){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(str)){
//                System.out.println("用户名存在，请重新输入");
                return i;
            }
        }
        return -1;
    }
    public static String checkUserName(ArrayList<StudentPlus> list){
        //1.用户名验证要求：用户名唯一；长度3~15位之间；只能有数字和字母组成
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            String userName = sc.next();
            int flag = getIndex(list,userName);
            if(flag>=0){
                System.out.println("用户名已存在,请重新输入");
//                singUp(list);
            } else {     //用户名唯一
                if (userName.length() < 3 || userName.length() > 15) {
                    System.out.println("用户名长度需在3~15个字符之间,请重新输入");
//                    singUp(list);
                } else {     //用户名长度符合
                    for (int i = 0; i < userName.length(); i++) {
                        if (userName.charAt(i) < '0' || userName.charAt(i) > 'z' ||
                                (userName.charAt(i) > '9' && userName.charAt(i) < 'A') ||
                                (userName.charAt(i) > 'Z' && userName.charAt(i) < 'a')) {
                            System.out.println("用户名只能是字母和数字的组合,请重新输入");
                            checkUserName(list);
                        } else {     //用户名为数字和字母的组合
                            boolean flagNum = strIsAllNum(userName);
                            if (flagNum) {
                                System.out.println("用户名不能是纯数字,请重新输入");
//                                singUp(list);
                            }else {
                                System.out.println("用户名验证通过");
                                return userName;
                            }
                        }
                    }

                }
            }

        }

    }
    public static String checkPassword(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入新密码：");
            String pass = sc.next();
            System.out.println("请再输入一次密码：");
            String pass2 = sc.next();
            if(!pass.equals(pass2)){
                System.out.println("两次密码不一致,请重新输入新密码");
            }else {
                System.out.println("密码验证通过");
                return pass;
            }
        }
    }
    public static String checkIdentity(){
        //长度为18；不能以0开头；前17位为纯数字最后一位可以是数字或X、x
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入身份证号码：");
            String strIde = sc.next();
            if (strIde.length()!=18) {
                System.out.println("身份证号为18位，请重新输入");
            }else {
                if (strIde.charAt(0)=='0') {
                    System.out.println("不能以0开头，请重新输入");
                }else {
                    for (int i = 0; i < strIde.length()-1; i++) {
                        if(strIde.charAt(i)<'0'||strIde.charAt(i)>'9'){
                            System.out.println("第"+(i+1)+"位:"+strIde.charAt(i)+"前17位为纯数字，请重新输入");
                            checkIdentity();
                        }
                    }
                    if ((strIde.charAt(17)>='0' && strIde.charAt(17)<='9')|| strIde.charAt(17)=='X' || strIde.charAt(17)=='x'){
                        System.out.println("身份证号验证通过");
                        return strIde;
                    }else {
                        System.out.println(strIde.charAt(17)+"最后一位不能是数字和大写“X”或小写“x”以外的字符");
                    }
                }
            }
        }
    }
    public static String checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码：");
            String strPone = sc.next();
            if (strPone.length() != 11) {
                System.out.println("电话号码为11位，请重新输入");
            } else {
                if (strPone.charAt(0) == '0') {
                    System.out.println("不能以0开头，请重新输入");
                } else {
                    for (int i = 0; i < strPone.length(); i++) {
                        if (strPone.charAt(i) < '0' || strPone.charAt(i) > '9') {
                            System.out.println("第" + (i + 1) + "位:" + strPone.charAt(i) + "电话号码为纯数字，请重新输入");
                            checkPhone();
                        }else {
                            System.out.println("电话号码验证通过");
                            return strPone;
                        }
                    }
                }
            }
        }
    }
    public static String creatCheckNum(){
        Random r = new Random();
        String checkNum = "";
        char c = 'a';
        int num = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            int choose = r.nextInt(2);
            if (num==i){
                checkNum = checkNum + r.nextInt(10);
                i++;
            }
            switch (choose){
                case 0->{
                    c = (char)r.nextInt(65,91);
                    break;
                }
                case 1->{
                    c = (char)r.nextInt(97,123);

                    break;
                }
            }
            checkNum = checkNum + c;
        }
        return checkNum;
    }
}
