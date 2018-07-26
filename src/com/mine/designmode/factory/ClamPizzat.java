package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 披萨的一种具体实现
 * @date 2018/07/25 9:33
 */
public class ClamPizzat extends Pizzat {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizzat(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
    }

}
