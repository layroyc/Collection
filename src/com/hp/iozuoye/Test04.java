package com.hp.iozuoye;

import java.io.File;
import java.util.Scanner;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //输入路径
        System.out.println("请输入当前目录");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        getFile(path);
    }

    private static void getFile(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            //获取路径下的所有文件
            File[] files = file.listFiles();
            for (int i = 0; i <files.length ; i++) {
                //如果还是文件夹  递归
                if (files[i].isDirectory()) {
                    System.out.println("目录:" + files[i].getPath());
                    getFile(files[i].getPath());
                }else{
                    System.out.println("文件:" + files[i].getPath());
                }
            }
        }else{
            System.out.println("外层文件:"+file.getPath());
        }
    }
}
