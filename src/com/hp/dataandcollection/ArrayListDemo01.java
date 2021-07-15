package com.hp.dataandcollection;

import com.hp.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* JDK 8 的 快速去取集合中的属性
* */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("王源");
        person.setHeight(180);
        person.setAge(20);

        Person bai = new Person();
        bai.setName("白敬亭");
        bai.setHeight(182);
        bai.setAge(25);

        Person er = new Person();
        er.setName("王嘉尔");
        er.setHeight(182);
        er.setAge(30);
    //需求：有个何炅 ,需要一个 String 集合 ，该集合中的值是提取与上面3000个 list中的值 把嘉宾的名字都存进去
        List<Person> list = new ArrayList();
        list.add(person);
        list.add(bai);
        list.add(er);
        System.out.println("list = " + list);

        /*List names = new ArrayList();
        names.add(person.getName());
        names.add(bai.getName());
        names.add(er.getName());
        System.out.println("names = " + names);*/

        ArrayList<String> names = new ArrayList<>();
        //1、遍历list集合，拿出对象的names 赋值给 新的names 集合中
        /*for (Person o : list) {
            String name = o.getName();
            names.add(name);//2.赋赋值给新的集合
        }
        System.out.println("names = " + names);*/

        //以上是传统的 新的呢？ JDK8 Stream()  //作业1：自我学习  JDK8的新特性 如何新的遍历 至少2个demo
        List<String> nameList = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameList = " + nameList);
    }
}
