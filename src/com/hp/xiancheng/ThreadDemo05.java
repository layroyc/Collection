package com.hp.xiancheng;
/*
* 线程的打断
* 背景：   1,王源,番茄炒蛋,20元
*         2,蔡蔡,打断  王源
*
*
* */
public class ThreadDemo05 {
    public static void main(String[] args) {
        Runnable target;
        Thread roy = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(true) {
                    try {
                        System.out.println("吃番茄炒蛋"+i);
                        i++;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            if(e.getMessage().equals("sleep interrupted")){
                                System.out.println("打断了呢");
                                break;
                            }

                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        roy.start();
        //打断
        Thread kunThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);//2秒之后打断他
                    roy.interrupt();//打断
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       kunThread.start();

    }
}
