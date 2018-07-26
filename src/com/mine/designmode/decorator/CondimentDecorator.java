package com.mine.designmode.decorator;

/**
 * @author Lucifer
 * @do 修饰了咖啡类的调料的抽象类
 * @date 2018/07/23 14:00
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDescription();

}
