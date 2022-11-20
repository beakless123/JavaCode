package com.itheima.dome1.test2;
//定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//学生的属性:学号，姓名，年龄。
//要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//要求2:添加完毕之后，遍历所有学生信息。
//要求3∶通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败。
//要求4︰删除完毕之后，遍历所有学生信息。
//要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
public class StudentTest {
    public static void main(String[] args) {
        //定义一个长度为3 数组存储1~3名学生对象作为初始数据
        Student[] arr = new Student[3];
        Student s1 = new Student(1,"zhangsan",18);
        Student s2 = new Student(2,"lisi",13);
//        Student s3 = new Student(3,"wangwu",16);
        arr[0] = s1;
        arr[1] = s2;
//        arr[2] = s3;
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //先生成对象在判断学号唯一性最后再添加
        //生成新对象
        Student sNew = new Student(4,"zhaoliu",20);
        boolean flag = containId(arr,sNew.getId());
        if (flag) {
            System.out.println("学号重复，请修改学号后重新添加");
        }else {
            //判断数组是否满元素
            int count = contianArr(arr);
            if (count == arr.length){   //数组是满元素,需要新建数组
                Student[] arrNew = creatNewArr(arr);
                arrNew[count] = sNew;
                //要求2:添加完毕之后，遍历所有学生信息
                for (int i = 0; i < arrNew.length; i++) {
                    System.out.println(arrNew[i].getId()+","+arrNew[i].getName()+","+arrNew[i].getAge());
                }
                //要求3∶通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败。
                int delId = 4;
                boolean flagDel = containId(arrNew,delId);
                if (flagDel){
                    for (int i = 0; i < arrNew.length; i++) {
                        if (arrNew[i].getId()==delId){
                            arrNew[i]=null;
                        }
                    }
                    //要求4︰删除完毕之后，遍历所有学生信息
                    for (int i = 0; i < arrNew.length; i++) {
                        if(arrNew[i]!=null){
                            System.out.println(arrNew[i].getId()+","+arrNew[i].getName()+","+arrNew[i].getAge());
                        }
                    }
                }else {
                    System.out.println("删除失败");
                }
                //要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
                int queId = 1;
                boolean flagQue = containId(arrNew,queId);
                if(flagQue){
                    for (int i = 0; i < arrNew.length; i++) {
                        if (arrNew[i]!=null){
                            if(arrNew[i].getId()==queId){
                                arrNew[i].setAge(arrNew[i].getAge()+1);
                            }
                        }
                    }
                }
                for (int i = 0; i < arrNew.length; i++) {
                    if(arrNew[i]!=null){
                        System.out.println(arrNew[i].getId()+","+arrNew[i].getName()+","+arrNew[i].getAge());
                    }
                }

            }else {         //数组不是满元素
                arr[count] = sNew;
                //要求2:添加完毕之后，遍历所有学生信息
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
                }
                //要求3∶通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败。
                int delId = 5;
                boolean flagDel = containId(arr,delId);
                if (flagDel){
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].getId()==delId){
                            arr[i]=null;
                        }
                    }
                    //要求4︰删除完毕之后，遍历所有学生信息
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i]!=null){
                            System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());
                        }
                    }
                }else {
                    System.out.println("删除失败");
                }
                int queId = 1;
                boolean flagQue = containId(arr,queId);
                if(flagQue){
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i]!=null){
                            if(arr[i].getId()==queId){
                                arr[i].setAge(arr[i].getAge()+1);
                            }
                        }
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]!=null){
                        System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());
                    }
                }
            }
        }

    }
    //判断学号唯一性
    public static boolean containId(Student arr[],int id){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null) {
                if (arr[i].getId() == id) {
                    //                System.out.println("学号重复，请修改学号后重新添加");
                    return true;
                }
            }
        }
        return false;
    }
    //判断数组是否满元素
    public static int contianArr(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count+=1;
            }
        }
        return count;
    }
    //新建数组，需要将原数组复制到新数组新数组长度在原数组基础上加一
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
