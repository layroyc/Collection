package com.hp.iozuoye;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");//输出当前项目目录下的文件

        boolean createfile = file.createNewFile();//创建文件
        System.out.println("文件创建成功 " + createfile);

        String name = file.getName();
        System.out.println("name = " + name);//文件的名字
        long length = file.length();
        System.out.println("length = " + length);//文件的大小

        //创建日历类
        Calendar calendar = Calendar.getInstance();
        //获取最后修改的时间
        long time = file.lastModified();
        //定义时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        calendar.setTimeInMillis(time);//根据此Calendar的给定参数设置当前时间
        System.out.println("修改时间:" + sdf.format(calendar.getTime()));


    }
}
