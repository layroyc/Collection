package com.hp.iozuoye;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //用户输入一个文件名
        System.out.println("请输入文件名:");
        String snt = scanner.nextLine().trim();
        File file = new File(snt);//去掉两边空白

        //截取文件名
        String sub = ".txt";
        String st = snt.substring(0, snt.indexOf(sub));

        String a = file.getAbsolutePath();//绝对路径
        System.out.println(a);
        //若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本
        //查看文件是否存在
        boolean exists = file.exists();//判断文件是否存在
        if(!exists){
            file.createNewFile();//如果不存在创建文件
        }else{
            System.out.println("该文件已经存在了");
            int i = 0;
            while(exists) {
                i++;
                file = new File(st + "_副本" + i + sub);
                System.out.println("file = " + file);
                exists = file.exists();//判断文件是否存在
            }
            file.createNewFile();//当文件不存在时，跳出循环接着创建新文件
        }
        System.out.println("创建文件的名字" + file.getName());
        scanner.close();

    }
}
