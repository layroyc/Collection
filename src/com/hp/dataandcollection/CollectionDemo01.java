package com.hp.dataandcollection;

import java.util.ArrayList;

/*
* 集合 非常重要
*
* set  没有顺序，不能重复
* list 有顺序 有索引
* map key,value 存储 key不能重复
* */
public class CollectionDemo01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //add增加
        list.add("唐僧--执着的追求");
        list.add("孙悟空--过硬的技术");
        list.add("猪八戒--体贴关怀");
        list.add("沙悟净--稳重的劳动力");
        list.add("白龙马--出门宝马");
        System.out.println("list = " + list);

        //尺寸
        int size = list.size();
        System.out.println("size = " + size);
        boolean empty = list.isEmpty();
        System.out.println("empty = " + empty);
       /* list.clear();//集合的清空
        System.out.println("list = " + list);

        boolean empty2 = list.isEmpty();//判断是否为空
        System.out.println("empty2 = " + empty2);*/


        //集合的遍历3种
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = " + list.get(i));
        }

        //思考题：为什么 collection不能使用for循环 ？？？ 为什么不能根据索引来取值呢？
        //因为 set 集合  没有索引下标  所以for 循环不能使用到 collection中
        for (Object o : list) {
            System.out.println("o = " + o);
        }

        //迭代器 和 for 循环的区别
        //迭代器工作：有游标，问下一个，有没有下一个元素，如果有拿出，没有就结束
        //
    }

}
