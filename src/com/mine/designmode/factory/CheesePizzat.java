package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 披萨的某个实例的具体实现
 * @date 2018/07/25 9:30
 */
public class CheesePizzat extends Pizzat{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizzat(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
