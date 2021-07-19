package com.hp.xiancheng;
/*
* 多个线程同时操作一个资源诞生的       安全问题
* 比如：多个 账户抢票
*多线程的安全问题
*
* synchronized 锁的机制  可以解决  多线程的 安全问题
* 解决手段是 将 原本的 多线程 “各干各的” 变为 按顺序执行
* 未加 synchronized 锁之前。线程是异步的，给方法上加锁（synchronized）就变成了同步
* 将 有序的同步的执行，就会 解决安全问题，但是 缺点是 因为有序 ，需要等待 方法内的程序走完
* 才进行下一个线程，所以，效率会慢
*
* synchronized 锁 锁在不同的位置，起到不同的作用效果。
*
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
                    //Thread.yield();//线程的让一让
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
                    //Thread.yield();//线程的让一让
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