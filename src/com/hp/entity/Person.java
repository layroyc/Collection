package com.hp.entity;
//泛型 必须要加,因为要做对比
public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//此接口是，比较接口，一个一个的比较
    @Override
    public int compareTo(Person o) {
        //目前是按照身高排序
        //如果 return 的返回值 大于0就是自身大于对比较的对象
        int h = this.getHeight()-o.getHeight();//身高
        int a =this.getAge()-o.getAge();//年龄
        int l = this.getName().length()-o.getName().length();//根据名字的长度
        return l;
    }
}
