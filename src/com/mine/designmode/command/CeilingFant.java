package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 吊扇bean的源码, 特殊版
 * @date 2018/07/26 14:53
 */
public class CeilingFant {

    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    String location;

    int speed;

    public CeilingFant(String location) {
        this.location = location;
        speed = OFF;
    }

    public void hign(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }

    public void off(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }

}
