package com.hp.xiancheng;
/*
* 线程......
*       以前代码 都是  自上而下的执行， 想有个分支怎么办？？？
*
* 创建线程的  第一种方法   缺点：直接继承extends Thread 浪费了一次继承
* */
public class ThreadDemo01 {
    public static void main(String[] args) {

        Thread t1 = new HotWaterThread();//创建1个烧水的线程
        Thread t2 = new clearcaiThread();//创建洗菜的线程
        t1.start();
        t2.start();
        //像这样的 做一会烧水 坐一会洗菜  叫做异步  ，没有先后顺序
        //如果烧水全部完成 再洗菜，这个叫同步，同步有先后顺序

    }
}

//如果只单单的new Thread ,他知识一个线程，线程中没有方法（任务），没有意义
//需要自己 创建一个线程，继承他的  任务（方法）
//线程中 最有意义的是 run 方法！！！
class HotWaterThread extends Thread{
    //重要的  线程的方法
    public  void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("烧了" + i+"瓶水");
        }
    }
}

class clearcaiThread extends Thread{
    //重要的  线程的方法
    public  void run(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("洗了" + i+"颗大白菜");
        }
    }
}
