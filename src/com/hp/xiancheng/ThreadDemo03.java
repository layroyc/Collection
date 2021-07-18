package com.hp.xiancheng;
/*
* 线程创建的 最好用的 匿名内部类
* 线程创建的第三种方法
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("洗菜"+i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("烧水"+i);
                }
            }
        }.start();
    }
}
