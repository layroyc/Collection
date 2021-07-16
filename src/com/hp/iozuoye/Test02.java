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
        File file = new File(scanner.nextLine());

        //使用File在当前目录下创建出来
        boolean newFile = file.createNewFile();
        System.out.println("创建成功:" + newFile);

        String a = file.getAbsolutePath();//绝对路径
        System.out.println(a);
        //若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本
        //查看文件是否存在
        boolean exists = file.exists();//判断文件是否存在
        if(exists){
            System.out.println("该文件已经存在,创建该文件的副本路径:格式为（test_副本1.txt）");
            File files = new File(scanner.nextLine());
            boolean newFile1 = files.createNewFile();
            System.out.println("并创建该文件的副本" + newFile1);
        }



    }
}
