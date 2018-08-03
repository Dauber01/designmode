package com.mine.designmode.template;

/**
 * @author Lucifer
 * @do 测试钩子作用的测试类
 * @date 2018/07/31 15:21
 */
public class BeverageTestDrive {

    public static void main(String[] args){
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee ...");
        coffeeWithHook.prepareRecipe();
    }

}
