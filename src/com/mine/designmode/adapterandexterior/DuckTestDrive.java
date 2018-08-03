package com.mine.designmode.adapterandexterior;

/**
 * @author Lucifer
 * @do 测试鸭子适配器的测试类
 * @date 2018/07/30 14:56
 */
public class DuckTestDrive {

    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("the turkey says ...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nthe duck says ...");
        testDuck(duck);
        System.out.println("\nthe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
