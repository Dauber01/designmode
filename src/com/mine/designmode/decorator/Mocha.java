package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 摩卡调料的装饰者
 * @date 2018/07/23 14:10
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
