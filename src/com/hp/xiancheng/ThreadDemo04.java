package com.hp.xiancheng;

import java.util.Random;

/*
* 线程的打断
* 打断 针对  线程的sleep 来讲的
*
* 讲解  线程拆炸弹的demo
* */
public class ThreadDemo04 {
    public static int time = 4;//炸弹的时间
    public static int password = new Random().nextInt(100000000);
    public static  boolean boom=true;

    public static void main(String[] args) {
        System.out.println("炸弹的密码是："+password);

        //第一个线程： 炸弹的倒计时，如果完成倒计时就爆炸
        Runnable target;
        Thread boomThread = new Thread(new Runnable() {
            @Override
            public void run() {
                //炸弹的倒计时
                System.out.println("定时炸弹已安装");
                try {
                    Thread.sleep(1000);//1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (time>=0){
                    try {
                        if(time==0){
                            System.out.println("炸弹爆炸");
                            boom=false;
                            break;
                        }
                        time--;
                        System.out.println("time="+time);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        if(e.getMessage().equals("sleep interrupted")){
                            System.out.println("拆弹成功 ");
                            break;
                        }

                        e.printStackTrace();
                    }

                }
            }
        });

        //第二个线程： 是 打断线程的倒计时，如果打断了，就不爆炸了
        Thread policeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                //警察负责拆炸弹，因为是模拟，所以 用打断的方式  打断boomThread 就可以了
                System.out.println("警察开始破解炸弹密码");
                while (boom){//等于true
                    if(password==new Random().nextInt(100000000)){
                       boomThread.interrupt();//这个是线程的打断
                       break;
                    }
                }
            }
        });
        boomThread.start();//炸弹线程开始
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        policeThread.start();//警察开始

    }
}

