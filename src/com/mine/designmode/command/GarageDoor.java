package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 某家电的厂商控制实现类
 * @date 2018/07/25 17:29
 */
public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + "turn on");
    }

    public void off(){
        System.out.println(name + "turn off");
    }

}
