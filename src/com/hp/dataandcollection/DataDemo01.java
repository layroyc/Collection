package com.hp.dataandcollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 企业开发中（java，bigData） 日期
* 日期类的层是 有一个long值 学名UTC时间
* 1970年 1月 1 日 00:00:00开始  计算时间元年
* 日期类 有2个包，sql / util  , 使用util包下的日期
*
*
* 这个日期类  功能不全有限， 如需 日期计算，需要使用 日历类 解决
* */
public class DataDemo01 {
    public static void main(String[] args) throws ParseException {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);//date 为什么会输出Wed Jul 14 09:46:31 CST 2021
        //toString() 被改写....可以重新 改为自己的时间

        long time = date.getTime();//获得 真实的时间，long值（毫秒数）
        System.out.println("time = " + time);//（等于2021-07-14） +10天

        /*date.setTime(31626227423962L);
        System.out.println("date = " + date);
*/
        //练习---查看10天之后是哪一天
       time += 1000*60*60*24*10L;
       date.setTime(time);
       System.out.println("date = " + date);

       //修改 日期显示格式  yyyy 必须为小写  日期转字符串
        String pattern="yyyy-MM-dd HH:mm:ss";
        String pattern2="yyyy/MM/dd HH:mm:ss";
        String pattern3="yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        String chinaDataStr = sdf.format(date);
        System.out.println("chinaDataStr = " + chinaDataStr);//普通人能看的懂的日期


        /*//字符串 转 日期
        String dateStr = "2020/09/07 23:00:00";
        Date parse = sdf.parse(dateStr);
        System.out.println("parse = " + parse);*/


        /*System.out.println("--------------------");
        String dateStr2 = "2020/09/07 23:00:00";
        try {
            Date parse = sdf.parse(dateStr);
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            System.out.println("你的日期字符串可能不是一个日期，你用心填写一下");
            e.printStackTrace();
        }*/




    }
}
