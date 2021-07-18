package com.hp.io;

import java.io.File;

public class IOSelectFileDemo01 {
    private static long size;
    public static void main(String[] args) {
        //查询当前目录的  所以有文件
        File file = new File(".");
        File[] files = file.listFiles();
        /*for (File file1 : files) {
            System.out.println("file1 = " + file1);
        }*/

        //查看所有文件
        long size = findAll(file);
        System.out.println("size = " + size+"字节");

        //作业1：  遍历 D盘 的 其中一个文件夹，并输出 这个文件夹的字节大小
    }

  private static long findAll(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                findAll(file1);
            }else{
                System.out.println("file1 = " + file1.length());
                size+= file1.length();//大小
            }
        }
        return size;
    }
}
