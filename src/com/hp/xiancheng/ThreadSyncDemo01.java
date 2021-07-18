package com.hp.xiancheng;
/*
* 多个线程同时操作一个资源诞生的       安全问题
* 比如：多个 账户抢票
*
* */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        //造两个线程无线的拿票
        Thread t1 = new Thread(){
            @Override
            public void run() {
                //模拟 黄牛1 取票
                while (true){//贪婪 一直取
                    int ticket = tickets.getTicket();
                    Thread.yield();//线程的让一让
                    System.out.println(getName()+"线程拿取了"+ticket);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                //模拟 黄牛1 取票
                while (true){//贪婪 一直取
                    int ticket = tickets.getTicket();
                    Thread.yield();//线程的让一让
                    System.out.println(getName()+"线程拿取了"+ticket);
                }
            }
        };
        t1.start(); t2.start();
    }
}

class Tickets {//12306
    private  int ticket = 200;//200张票

    public synchronized  int getTicket() {//synchronized枷锁
        if(ticket==0){
            System.out.println("票没有了");
            throw new RuntimeException("票没有了");
        }
        Thread.yield();//线程的让一让
        return ticket--;
    }
}