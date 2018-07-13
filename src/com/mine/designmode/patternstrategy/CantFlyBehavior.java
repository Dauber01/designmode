package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 不会飞实现类
 * @date 2018/07/11 17:01
 */
public class CantFlyBehavior implements FlyBehaviorAble {

    @Override
    public void fly() {
        System.out.println("i can't fly");
    }

}
