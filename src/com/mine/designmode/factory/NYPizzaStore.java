package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 纽约的披萨商店bean
 * @date 2018/07/25 9:35
 */
public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory simplePizzaFactory) {
        super(simplePizzaFactory);
    }

    protected Pizzat createPizza(String item){
        Pizzat pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizzat(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if (item.equals("veggie")){
            pizza = new CheesePizzat(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else {
            //TODO 其它的一些披萨实现
        }
        return pizza;
    }
}
