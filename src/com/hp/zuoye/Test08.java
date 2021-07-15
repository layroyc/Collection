package com.hp.zuoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 *
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        String pattern ="yyyy-MM-dd";//设置日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);

        List<Date> list = new ArrayList<Date>();
        for(int i=0;i<3;i++){
            System.out.println("请输入第:"+(i+1)+"个日期格式为:yyyy-MM-dd");
            String str = scanner.nextLine();
            Date date = sdf.parse(str);
            list.add(date);
        }
        //输出集合中的日期
        System.out.println("输出集合中的日期:");
        for(Date date : list){
            System.out.println(sdf.format(date));
        }
        Collections.sort(list);//list的快速排序(不是人工指定的排序) 按自然顺序排序
        System.out.println("排序后输出集合中的日期:");
        for(Date date : list){
            System.out.println(sdf.format(date));
        }

    }
}
