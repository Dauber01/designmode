package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 主测试方法
 * @date 2018/07/11 17:07
 */
public class MainTest {

    public static void main(String[] args){
        Duck whiteDuck = new WhiteDuck(new CanFlyBehavior(), new HaHaQuackBehavior());
        whiteDuck.performFly();
        whiteDuck.performQuack();
    }

}
