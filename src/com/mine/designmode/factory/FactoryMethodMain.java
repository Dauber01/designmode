package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 工厂方法的测试类
 * @date 2018/07/24 16:34
 */
public class FactoryMethodMain {

    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");
    }

}
