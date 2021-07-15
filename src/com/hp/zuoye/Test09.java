package com.hp.zuoye;

import com.hp.entity.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Emp emp1=new Emp();
        emp1.setName("张三");
        emp1.setAge(25);
        emp1.setGender("男");
        emp1.setSalary(5000);
        //把字符串转换成日期格式的
        String str="2006-02-15";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //来公司的日期
        Date date=sdf.parse(str);
        String date2=sdf.format(date);
        emp1.setHiredate(date2);


        Emp emp2=new Emp();
        emp2.setName("李四");
        emp2.setAge(26);
        emp2.setGender("女");
        emp2.setSalary(6000);
        //把字符串转换成日期格式的样式
        String str2="2007-12-24";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
        //来公司的日期
        Date date3=sdf2.parse(str2);
        String  date4=sdf2.format(date3);
        emp2.setHiredate(date4);

        List<Emp> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);

        //遍历
        for (Emp emp : list) {
            System.out.println("emp = " + emp);
        }
        //创建Calendar对象
        Calendar calendar=Calendar.getInstance();
        //获取来公司的日期
        calendar.setTime(date);
        //获取当月是入职的第几个月
        calendar.set(Calendar.DAY_OF_MONTH,4);
        //获取三个月当周的星期五
        calendar.set(Calendar.DAY_OF_WEEK,6);
        //将日期格式化一下
        String dates=sdf.format(calendar.getTime());
        System.out.println("dates = " + dates);
    }
}
