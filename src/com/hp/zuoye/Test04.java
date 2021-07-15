package com.hp.zuoye;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //创建一个List集合并添加元素0-9
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        //获取子集[3,4,5,6]
        List<Integer> subList = list.subList(3, 7);
        System.out.println("子集为: = " + subList);
        //将子集元素扩大10倍
        for (int i = 0; i <subList.size() ; i++) {
            subList.set(i,subList.get(i)*10);
        }
        System.out.println("subList = " + subList);
        //输出原集合
        System.out.println("list = " + list);
        //删除集合中的[7,8,9]
        ArrayList list1 = new ArrayList<>();
        List<Integer> subList2 = list.subList(7,list.size());
        System.out.println("subList2 = " + subList2);//打印要删除的子集
        list.removeAll(subList2);
        System.out.println("list = " + list);


    }
}
