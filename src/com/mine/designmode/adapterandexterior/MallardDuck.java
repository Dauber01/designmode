package com.mine.designmode.adapterandexterior;

/**
 * @author Lucifer
 * @do 绿头鸭的实现
 * @date 2018/07/30 14:47
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
