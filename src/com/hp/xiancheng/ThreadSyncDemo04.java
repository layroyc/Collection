package com.hp.xiancheng;

/*
*一般来说，用不到
* */
public class ThreadSyncDemo04 {
    public static void main(String[] args) {
        Shop3 shop3 = new Shop3();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    shop3.buy01();//买优衣库衣服
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    shop3.buy02();//买冰淇淋
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Shop3 {//优衣库

    public void buy01() throws InterruptedException {
        //如果 不加上 synchronized 锁，完了 火了   同时选同时试衣
        Thread thread = Thread.currentThread();//当前线程
        System.out.println(thread.getName() + "xxx正在选衣服");
        Thread.sleep(5000);//5秒

        synchronized (this) {//使用synchronized块，锁在关键位置
            System.out.println(thread.getName() + "进入试衣间试衣服");
            Thread.sleep(3000);//5秒
            System.out.println("试完衣服出来了");
        }
    }

    //买冰淇淋，在优衣库对面
    public synchronized void buy02() throws InterruptedException {
        Thread thread = Thread.currentThread();//当前线程
        System.out.println(thread.getName() + "xxx正在排队买冰淇淋");

        }

}
