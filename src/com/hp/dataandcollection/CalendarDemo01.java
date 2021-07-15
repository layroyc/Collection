package com.hp.dataandcollection;

import java.util.Calendar;
import java.util.Date;

/*
* 日历类： 可以做日期的计算
* 使用场景，项目中：预约功能，日期计算功能
* 常用的APP ,美柚, 预约, 入职日期计算, 旅游模块
*
* 创建对象----->new 出来的
* 对象如果不能被(无参)new: 1)无参构造私有化了，可能是单例模式
*                       2)该类可能是个  接口/抽象类，必须 new 他实现类（子类）
* */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //日历    中国人的日历（农历）（阳历）   日本人的日历
        //Calendar是个抽象类，提供的方法   getInstance()//阳历
        //创建日历不单单只有new ，还有  类的实例方法
        //calendar功能上包含了  date 的大部分功能。 是date的升级版
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        Date d = calendar.getTime();
        calendar.get(Calendar.YEAR);//获取当前年份
        System.out.println("calendar = " + calendar.getTime());
        /*System.out.println("d = " + d);
        calendar.get(Calendar.MONTH+1);
        System.out.println("d = " + d);
        calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("calendar = " + calendar);*/

        /*//日历可以 进行计算  不如 增加 add
        //增加一个年份    增加10年Calendar.YEAR按年
        //应用场景：买保险  结婚纪念日等
        calendar.add(Calendar.YEAR,10);
        System.out.println("calendar = " + calendar.getTime());*/

        /*//加月
        calendar.add(Calendar.MONTH,1);
        //加天
        calendar.add(Calendar.DAY_OF_YEAR,1);
        //减去一天
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        //比如    设置当周的周五日期   指定的日期
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
        System.out.println("calendar = " + calendar.getTime());*/

        //能玩 计算 每个月的最大值   求月底的时间
        /*int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("days = " + days);//31天*/


        //      ----------日历的get方法， 日历的 其他获取方法
        //如：查询今年过了多少天
        /*int i = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("i = " + i);*/

        //如：查询 今天是 周几   阳历是国外的，从周日开始
        /*int i2 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("i2 = " + i2);*/

        //今天是周三
        String[] weeks={"周日","周一","周二","周三","周四","周五","周六"};
        int i3 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是 = " + weeks[i3]);

        //获取 月份
        int i4 = calendar.get(Calendar.MONTH)+1;
        System.out.println("i4 = " + i4);


        //日历    set 设置
        //设置 2008年
        calendar.set(Calendar.YEAR,2008);
        System.out.println("calendar = " + calendar);
        //设置 月份
        calendar.set(Calendar.MONTH,Calendar.APRIL);//月份从0开始
        System.out.println("calendar = " + calendar.getTime());




    }
}
