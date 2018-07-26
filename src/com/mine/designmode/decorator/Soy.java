package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 油料的装饰者bean
 * @date 2018/07/23 14:12
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.99;
    }
}
