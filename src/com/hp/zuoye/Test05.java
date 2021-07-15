package com.hp.zuoye;

import java.util.ArrayList;
import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        //创建一个List集合，并添加元素0-9
        //将集合转换为一个Integer数组并输出数组每一个元素
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        Integer[] it = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(it));


    }
}
