package com.mine.designmode.Iteratorandcombination;

/**
 * @author Lucifer
 * @do 菜单的子项
 * @date 2018/08/02 20:54
 */
public class MenuItem {

    String name;

    String description;

    boolean vegetarian;

    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
