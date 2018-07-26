package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 混合黑咖啡的尸体bean
 * @date 2018/07/23 14:08
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
