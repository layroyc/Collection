package com.hp.zuoye;

import com.hp.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("王源");
        person.setHeight(180);
        person.setAge(20);

        List<Person> list = new ArrayList();
        list.add(person);
        System.out.println("list = " + list);

        ArrayList<String> names = new ArrayList<>();
        //用list.stream()流的方式来遍历
        List<String> nameList = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameList = " + nameList);
    }
}
