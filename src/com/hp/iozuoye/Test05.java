package com.hp.iozuoye;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件或目录名:");
        File file = new File(scanner.nextLine());
        boolean exists = file.exists();
        if (exists) {
            if (file.isFile()) {
                file.delete();
                System.out.println(file + "该文件已删除成功！");
            }
            if (file.isDirectory()) {
                System.out.println("该文件是目录");
                Scanner sc = new Scanner(System.in);
                System.out.println("您可以添加目录或文件：");
                String s1 = scanner.nextLine();

                File file1 = new File(s1);
                if (file.isDirectory()) {
                    //如果是新增目录
                    boolean Mu = file1.mkdir();
                    System.out.println("创建的目录名是：" + file1.getName());
                }
                if (file.isFile()) {
                    boolean wen = file1.createNewFile();
                    System.out.println("创建新文件名是：" + file1.getName());
                }
            }
        } else {
            System.out.println("您输入的文件或文件目录不存在！");

        }
    }
}
