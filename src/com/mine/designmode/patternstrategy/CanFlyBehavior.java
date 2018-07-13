package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 可以飞的实现类
 * @date 2018/07/11 17:00
 */
public class CanFlyBehavior implements FlyBehaviorAble {

    @Override
    public void fly() {
        System.out.println("i can fly");
    }

}
