package com.mine.designmode.template;

/**
 * @author Lucifer
 * @do 咖啡因饮料的抽象类
 * @date 2018/07/31 14:59
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
