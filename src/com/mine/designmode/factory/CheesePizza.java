package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 披萨的一种
 * @date 2018/07/24 16:19
 */
public class CheesePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("this is cheesePizza");
    }

    @Override
    void bake() {

    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
