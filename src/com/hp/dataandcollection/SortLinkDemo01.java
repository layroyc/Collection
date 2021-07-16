package com.hp.dataandcollection;

import com.hp.entity.Person;

import java.util.ArrayList;
import java.util.Collections;

/*
* sortList 排序集合  对集合进行自然排序（从大到小 升序）
* 只能对list排序  对set不可以 因为set是无序的
* */
public class SortLinkDemo01 {
    public static void main(String[] args) {
        //纯数字
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(88);
        list.add(32);
        list.add(66);
        System.out.println("list = " + list);
        Collections.sort(list);//自然排序 升序
        System.out.println("list = " + list);

        //字符串排序 根据字符编码排序
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("cc");
        list2.add("王源");
        list2.add("白敬亭");
        list2.add("王嘉尔");
        System.out.println("list2 = " + list2);
        //排序
        Collections.sort(list2);
        System.out.println("list2 = " + list2);

        //对象的排序(应用的地方很广)  对对象的属性(身高) 的排序
        Person p1 = new Person();
        p1.setName("王源二字弟弟");
        p1.setAge(18);
        p1.setHeight(182);
        Person p2 = new Person();
        p2.setName("王嘉尔");
        p2.setAge(26);
        p2.setHeight(183);
        Person p3 = new Person();
        p3.setName("白敬亭小白");
        p3.setAge(25);
        p3.setHeight(180);
        Person p4 = new Person();
        p4.setName("蔡蔡");
        p4.setAge(20);
        p4.setHeight(185);

        ArrayList<Person> plist = new ArrayList<>();
        plist.add(p1);//添加存进去
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);

        /*System.out.println("未排序之前" + plist);
        Collections.sort(plist);
        System.out.println("排序之后" + plist);*/

        //按年龄从大到小排序
        Collections.reverse(plist);//反转
        System.out.println("排序之后" + plist);

        //按照姓名的长度排序
        System.out.println("未排序之前" + plist);
        Collections.sort(plist);
        System.out.println("排序之后" + plist);//从小到大  升序
        Collections.reverse(plist);
        System.out.println("反转排序之后" + plist);//从大到小 降序


    }
}
