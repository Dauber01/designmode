package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 调料的实现类
 * @date 2018/07/23 14:15
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.89 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
