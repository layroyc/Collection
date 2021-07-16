package com.hp.zuoye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
* 创建一个List集合，并存放10个随机数，然后排序该集合
* 后输出
* */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//创建一个集合
        Random random = new Random();//创建随机数对象

        for (int i = 0; i < 10; i++) {//生成10个随机数(100内的)
            int a = random.nextInt(100);//转为int类型
            list.add(0,a);//存入到list集合中
        }
        System.out.println("list = " + list);

        Collections.sort(list);//默认升序
        System.out.println("list = " + list);

    }
}
