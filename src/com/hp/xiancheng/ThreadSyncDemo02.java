package com.hp.xiancheng;
/*
* synchronized 锁，尽量锁在  范围小的位置上
*
* 越小，效率越高
*
* 优衣库
* synchronized 锁在方法上，那么方法中有 可以 多个线程共同使用，那么会造成资源浪费
* 降低效率，锁应该 锁在关键位置
*
* */
public class ThreadSyncDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        //创建线程
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{//优衣库
    public void buy() throws InterruptedException {
        //如果 不加上 synchronized 锁，完了 火了   同时选同时试衣
        Thread thread = Thread.currentThread();//当前线程
        System.out.println(thread.getName()+"xxx正在选衣服");
        Thread.sleep(5000);//5秒

        synchronized (this){//使用synchronized块，锁在关键位置
            System.out.println(thread.getName()+"进入试衣间试衣服");
            Thread.sleep(3000);//5秒
            System.out.println("试完衣服出来了");
        }
    }
}