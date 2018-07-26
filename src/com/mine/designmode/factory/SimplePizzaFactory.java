package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 简单的披萨工厂类
 * @date 2018/07/24 16:26
 */
public class SimplePizzaFactory {

    /**
     * @do 根据传入的披萨类型参数去初始话对应的pizza bean
     * @param type 披萨类型
     * @return 对应的pizza bean
     */
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
