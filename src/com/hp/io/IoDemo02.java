package com.hp.io;

import java.io.File;

public class IoDemo02 {
    public static void main(String[] args) {
        //创建文件 所有IO 底层都不是 java操作的  而是 java 调用的 所在系统的底层的操作
        File file = new File("ioc");
        if (!file.exists()) {
            file.mkdirs();//不加s  只能1层，加s可以多层，一般用s
        }else{
            System.out.println("文件已存在");
        }

        File file1 = new File("io1/io2/io3");
        if (!file.exists()) {
            file.mkdirs();//创建多层目录
        }else{
            System.out.println("文件已存在");
        }
    }
}
