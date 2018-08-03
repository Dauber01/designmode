package com.mine.designmode.adapterandexterior;

/**
 * @author Lucifer
 * @do 火鸡的一个具体实现
 * @date 2018/07/30 14:50
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm fly a short distance");
    }
}
