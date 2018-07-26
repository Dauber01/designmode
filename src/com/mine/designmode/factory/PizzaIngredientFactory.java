package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 生产披萨的工厂接口
 * @date 2018/07/24 17:16
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
