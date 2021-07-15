package com.hp.dataandcollection;

import java.util.*;

/*
* 斗地主 模拟洗牌
* 牌数 ： 54张， 大王,小王, 2-10,J,Q K,A四个桃
* ♥,♠,♦,♣
* 
* */
public class DouDiZhuTest {
    public static void main(String[] args) {
        //1、先造出四个花色
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");
        //2.造出10个 2-10
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 2; i <=10 ; i++) {
            numbers.add(i+"");
        }
            numbers.add("J");
            numbers.add("Q");
            numbers.add("K");
            numbers.add("A");
        //System.out.println("numbers = " + numbers);

        //3.上面的 colors 和numbers 进行一个整合 放到一个新的集合中
        //如何做到嵌套循环？？？
        List<String> pukepai = new ArrayList<>();//创建一个新的集合
        for (String color : colors) {
            for (String number : numbers) {
                pukepai.add(color+number);
            }
        }
        pukepai.add("BigKing");
        pukepai.add("litterKing");
        //System.out.println("pukepai = " + pukepai);//有多少张牌
        //System.out.println("pukepai = " + pukepai.size());//牌的长度

        //如果使用set也无法打乱排序,改为 list ,有个方法可以 打乱他的排序，但只能打乱list排序
        //因为 Set 是无序的

        Collections.shuffle(pukepai);//打断list的排序
        //System.out.println("pukepai = " + pukepai);
        // Collections.sort(pukepai);//list的快速排序(不是人工指定的排序)
        //System.out.println("pukepai = " + pukepai);

        //给player1 player2 player3 发牌
            List<String> player1 = new ArrayList<>();//玩家1
            List<String> player2 = new ArrayList<>();//玩家2
            List<String> player3 = new ArrayList<>();//玩家3
            List<String> diPai = new ArrayList<>();//3张底牌
        for (int i = 0; i <pukepai.size() ; i++) {
            String pName = pukepai.get(i);//每张扑克牌具体的牌数
            if (i>=51) {
                //规定个地主,  规定 谁摸到红桃3 谁是地主,  注意:  底牌里面不能包含红桃3 .
                if(pName!="♥3") {
                    diPai.add(pName);//埋最后3张的底牌
                }
            }else{
                //给玩家1,2,3, 发 前面的 51张牌
                if (i%3 == 0) {
                    player1.add(pName);
                    if(pName.contains("♥3")) {
                        System.out.println("玩家1是地主 ");
                    }
                }else if(i%3==1){
                    player2.add(pName);
                    if(pName.contains("♥3")) {
                        System.out.println("玩家2是地主 ");
                    }
                }else{
                    player3.add(pName);
                    if(pName.contains("♥3")) {
                        System.out.println("玩家3是地主 ");
                    }
                }

            }
        }
        System.out.println("玩家1 = " + player1);
        System.out.println("玩家2 = " + player2);
        System.out.println("玩家3 = " + player3);
        System.out.println("底牌是： = " + diPai);
    }
}
