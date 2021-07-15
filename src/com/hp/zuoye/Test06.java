package com.hp.zuoye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 创建一个字符串数组:{"one","two","three"}
* 然后将该数组转换为一个List集合
* */
public class Test06 {
    public static void main(String[] args) {
        //创建一个字符串数组
        String[] array = {"one","two","three"};
        //将该数组转换为一个List集合
        List<String> list = Arrays.asList(array);
        ArrayList list2 = new ArrayList(list);
        System.out.println(list2);
    }
}
