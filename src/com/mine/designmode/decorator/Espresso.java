package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 浓缩咖啡的实体bean
 * @date 2018/07/23 14:04
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
