package com.hp.xiancheng;
/*
* 创建线程的第二种方法  不用继承 直接实现
* */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xiCai = new XiCai();
        Runnable shaoshui = new ShaoSui();

        Thread xiCaiThread = new Thread(xiCai);
        Thread shaoshuiThread = new Thread(shaoshui);

        xiCaiThread.start();
        shaoshuiThread.start();
    }
}
//直接实现方法
class XiCai implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗菜"+i);
        }
    }
}

class ShaoSui implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧水"+i);
        }
    }
}