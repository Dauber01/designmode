package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 厂商实现的电灯自动控制的实现类
 * @date 2018/07/25 16:58
 */
public class Light {

    private String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println( name + "light on");
    }

    public void off(){
        System.out.println(name + "light off");
    }

}
