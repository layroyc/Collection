package com.hp.zuoye;

import com.hp.entity.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//定义equals方法，要求名字以及年龄相同，则认为内容一致。
public class EmpTest {
    public static void main(String[] args) throws ParseException {
        Emp emp1=new Emp();
        emp1.setName("张三");
        emp1.setAge(25);
        emp1.setGender("男");
        emp1.setSalary(5000);
        //把字符串转换成日期格式的
        String str="2006-02-15";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(str);
        String date2=sdf.format(date);
        emp1.setHiredate(date2);


        List<Emp> list=new ArrayList<>();
        list.add(emp1);

        //遍历
        for (Emp emp : list) {
            System.out.println("emp = " + emp);
        }

        System.out.println("请输入姓名:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("输入的姓名:" + name);
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
        System.out.println("输入的年龄:" + age);

        if(name.equals(emp1.getName())){
            if (age == emp1.getAge()) {
                System.out.println("你的内容一致");
            }
        }else{
            System.out.println("你的内容不一致");
        }

    }

}
