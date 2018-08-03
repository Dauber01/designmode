package com.mine.designmode.Iteratorandcombination;

import java.util.Iterator;

/**
 * @author Lucifer
 * @do 菜单项的具体实现
 * @date 2018/08/03 10:29
 */
public class MenuItemt extends MenuComponent {

    String name;

    String description;

    boolean vegetarion;

    double price;

    public MenuItemt(String name, String description, boolean vegetarion, double price) {
        this.name = name;
        this.description = description;
        this.vegetarion = vegetarion;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public boolean isVegetarion() {
        return vegetarion;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        if (isVegetarion()){
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println(" --" + getDescription());
    }

}
