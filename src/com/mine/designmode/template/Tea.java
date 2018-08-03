package com.mine.designmode.template;

/**
 * @author Lucifer
 * @do 茶的具体实现类
 * @date 2018/07/31 15:03
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
