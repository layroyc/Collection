package com.hp.xiancheng;
/*
* 线程中的阻塞
* 河南电信--------300张电话卡--------中国电信
*
* */
public class ThreadSleepDemo01 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            Thread.sleep(2);//线程的阻塞
            System.out.println("访问中国电信" + i+"次");
        }
        //main 方法 就是一个 线程 是一个主线程
        Thread thread = Thread.currentThread();//拿到当前的线程
        String name = thread.getName();//线程的名字
        System.out.println("name = " + name);
        long id = thread.getId();//线程的唯一id
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon();//是否是守护线程
        System.out.println("daemon = " + daemon);
        int priority = thread.getPriority();//线程的优先级
        System.out.println("priority = " + priority);
        boolean alive = thread.isAlive();//线程是否死掉
        System.out.println("alive = " + alive);
    }
}
