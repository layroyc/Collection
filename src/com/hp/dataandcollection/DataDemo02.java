package com.hp.dataandcollection;

import java.util.Calendar;

public class DataDemo02 {
    public static void main(String[] args) {
        /*Date date = new Date();//获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(date));//将当前时间格式化输出格式转换为yyyy年MM月dd日 HH:mm:ss*/

        /*//日期格式化
        Date date = new Date();
        System.out.println(date.toLocaleString());*/


        /*//获取为日期和时间使用 SHORT 风格的默认日期/时间格式器。
        DateFormat df =  DateFormat.getInstance();
        //对指定 的日期进行格式化
        String time = df.format(date);
        System.out.println(time);*/


        /*//获取当前日期时间
        Date date = new Date();
        //想要什么样的模式可自定义
        String pattern = "yyyy-MM-dd HH/mm/ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        //以指定的模式格式化哪个日期
        String wy =  sdf.format(date);
        System.out.println("wy = " + wy);
*/

        /*LocalDate d = LocalDate.now(); //当前日期
        LocalTime t = LocalTime.now(); //当前时间
        LocalDateTime dt = LocalDateTime.now();   //当前时间和日期
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);*/


        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.YEAR);
        System.out.println(calendar.getTime());
        calendar.get(Calendar.MONTH);
        System.out.println(calendar.getTime());



    }
}
