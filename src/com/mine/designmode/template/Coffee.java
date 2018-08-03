package com.mine.designmode.template;

/**
 * @author Lucifer
 * @do 咖啡的具体实现bean
 * @date 2018/07/31 15:04
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
