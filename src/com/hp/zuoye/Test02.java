package com.hp.zuoye;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 创建一个集合，存放元素"1","$","2","$","3","$","4"
*   使用迭代器遍历集合，并在过程中删除所有的"$"，
*   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
*
* */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("$");
        list.add("2");
        list.add("$");
        list.add("3");
        list.add("$");
        list.add("4");
        System.out.println("list = " + list);

        /*for (int i = 0; i < list.size(); i++) {//for循环删除
            if (list.get(i).equals("$")) {
                list.remove(i);
            }
        }
        System.out.println("list = " + list);*/

        //使用迭代器遍历集合，并在过程中删除所有的"$"
        Iterator<Object> it = list.iterator();
        while (it.hasNext()){
            String ww = (String) it.next();
            if (ww.equals("$")) {
                it.remove();
            }
        }
        System.out.println("list = " + list);

        //最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
        /*List<String> nameList = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameList = " + nameList);*/


    }
}
