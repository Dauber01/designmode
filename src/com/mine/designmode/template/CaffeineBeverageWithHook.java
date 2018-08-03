package com.mine.designmode.template;

/**
 * @author Lucifer
 * @do 带有钩子的咖啡因饮料的bean
 * @date 2018/07/31 15:08
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pour into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }

}
