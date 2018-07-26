package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 装饰者模式, 星巴克咖啡的类
 * @date 2018/07/23 13:58
 */
public abstract class Beverage {

    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
