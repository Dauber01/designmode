package com.mine.designmode.factory;

/**
 * @author Lucifer
 * @do 披萨的抽象接口
 * @date 2018/07/24 16:13
 */
public abstract class Pizza {

    private String name;

    private String taste;

   abstract void prepare();

   abstract void bake();

   abstract void cut();

   abstract void box();

}
