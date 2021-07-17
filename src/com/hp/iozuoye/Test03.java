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

        //创建目录
        if(exists){
            System.out.println("该目录已经存在");
            int i = 0;
            while(exists){
                i++;
                file = new File(dir+"_副本" + i);
                System.out.println("file = " + file);
                exists = file.isDirectory(); //判断目录是否存在
            }
            file.mkdirs();//目录不存在时，跳出循环接着创建新目录
            System.out.println("创建目录副本成功！");
        }else{
            System.out.println("该目录不存在");
            file.mkdir();
            System.out.println("创建目录" + dir);
        }
        System.out.println("目录名为:" + file.getName());
        scanner.close();

    }
}
