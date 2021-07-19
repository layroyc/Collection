package com.hp.xiancheng;
/*
* 刚刚 1-2  是锁在普通方法上的
* 现在是 锁在 静态方法上.synchronized 可以锁在 带static 方法上的
*synchronized//同步锁
*
* */
public class ThreadSyncDemo03 {
    public static void main(String[] args) {
        //创建线程
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Shop2.buy();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Shop2.buy();
            }
        };
        t1.start(); t2.start();
    }
}

class Shop2{
    public synchronized static void buy(){
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName()+"xxx选衣服");
        try {
            thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"xxx试衣服");
        try {
            thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"出来了");
    }
        }