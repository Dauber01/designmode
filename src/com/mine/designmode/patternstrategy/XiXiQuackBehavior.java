package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 嘻嘻笑的实现类
 * @date 2018/07/11 17:03
 */
public class XiXiQuackBehavior implements QuackBehaviorAble{

    @Override
    public void quack() {
        System.out.println("i quack 嘻嘻嘻");
    }

}
