package com.hp.zuoye;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("王源");
        list.add("白敬亭");
        list.add("王嘉尔");

        //JDK8新特征 中的foreach遍历方式
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("o = " + o);
            }
        });
    }
}
