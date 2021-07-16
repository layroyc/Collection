package com.hp.iozuoye;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //用户输入一个文件名
        System.out.println("请输入目录名:");
        String dir = scanner.nextLine();
        File file = new File(dir);

        //若该目录已经存在，则提示用户该目录已经存在。并创建该目录副本
        //查看目录是否存在
        boolean exists = file.exists();//判断文件或目录是否存在

        //D:\dashuju\ideaIU2018\works\集合日期\cc
        //创建目录
        if(exists){
            System.out.println("该目录已经存在");
            file.mkdirs();
            System.out.println("创建目录副本成功！");
        }else{
            System.out.println("该目录不存在");
            file.mkdir();
            System.out.println("创建目录" + dir);
        }


    }
}
