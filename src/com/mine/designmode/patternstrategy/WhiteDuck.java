package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 白色鸭子的实现类
 * @date 2018/07/11 17:05
 */
public class WhiteDuck extends Duck {

    public WhiteDuck(FlyBehaviorAble flyBehaviorAble, QuackBehaviorAble quackBehaviorAble) {
        this.flyBehaviorAble = flyBehaviorAble;
        this.quackBehaviorAble = quackBehaviorAble;
    }

}
