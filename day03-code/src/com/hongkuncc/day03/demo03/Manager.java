package com.hongkuncc.day03.demo03;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();//当前群主余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱
        super.setMoney(totalMoney - leftMoney);

        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i <count -1 ; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);
        return redList;
    }

}
