package com.mine.designmode.patternstrategy;

/**
 * @author Lucifer
 * @do 鸭子的抽象类, 提供共有的信息
 * @date 2018/07/11 16:45
 */
public abstract class Duck {

    protected FlyBehaviorAble flyBehaviorAble;

    protected QuackBehaviorAble quackBehaviorAble;

    public void swim(){
        System.out.println("I'm a duck , i can swim");
    }

    public void display(){
        System.out.println("白色,带羽毛");
    }

    public void performQuack(){
        quackBehaviorAble.quack();
    }

    public void performFly(){
        flyBehaviorAble.fly();
    }

}
