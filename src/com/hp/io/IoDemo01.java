package com.hp.io;

import java.io.File;
import java.io.IOException;

/*
* File 文件
*
*   可读可写可执行
* */
public class IoDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("io03.txt");//定义了个file文件在根目录下  配置路径

        /*try {
            boolean newFile = file.createNewFile();//创建新文件
            System.out.println("可以创建新文件 " + newFile);
        } catch (IOException e) {
            System.out.println("不能创建新文件");
            e.printStackTrace();
        }*/

        //查看文件是否存在  一定要有这个代码 不然会覆盖
        boolean exists = file.exists();//判断文件是否存在
        if(exists){
            System.out.println("文件已存在，Boolean值" + exists);
        }else{
            System.out.println("文件不存在，Boolean值" + exists);
            boolean createfile = file.createNewFile();//创建文件
            System.out.println("文件创建成功 " + createfile);
        }
        boolean isfile = file.isFile();
        System.out.println("是否是文件" + isfile);
        boolean directory = file.isDirectory();
        System.out.println("是否是目录" + directory);
        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件=" + hidden);

        String name = file.getName();//名字
        System.out.println("name = " + name);
        long length = file.length();//长度
        System.out.println("length = " + length);

    }
}
