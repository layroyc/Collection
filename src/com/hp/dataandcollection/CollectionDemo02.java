package com.hp.dataandcollection;

import com.hp.entity.Person;

import java.util.ArrayList;

/*
* 集合  存的是对象的什么？
*
* 存的是对象的引用，当 对象通过外力改变了，那么 集合 中的内容也会改变
*
* */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Person person = new Person();
               person.setName("王源");
               person.setHeight(180);
               person.setAge(20);

        ArrayList list = new ArrayList();
                list.add(person);

        for (Object o : list) {
            System.out.println("o = " + o);
        }

            person.setHeight(182);
            person.setAge(18);

        for (Object o : list) {
            System.out.println("o = " + o);
        }

    }
}
