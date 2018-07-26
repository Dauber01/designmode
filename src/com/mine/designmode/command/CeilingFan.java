package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 某个电器的厂商实现类
 * @date 2018/07/25 17:27
 */
public class CeilingFan {

    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + "turn on");
    }

    public void off(){
        System.out.println(name + "turn off");
    }

}
