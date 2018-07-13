package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 哈哈叫的实现类
 * @date 2018/07/11 17:02
 */
public class HaHaQuackBehavior implements QuackBehaviorAble {

    @Override
    public void quack() {
        System.out.println("i quack 哈哈哈");
    }

}
