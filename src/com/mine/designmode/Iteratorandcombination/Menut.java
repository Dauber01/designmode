package com.mine.designmode.Iteratorandcombination;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Lucifer
 * @do 菜单的共有实现abstract
 * @date 2018/08/03 10:34
 */
public class Menut extends MenuComponent {

    ArrayList menuComponents = new ArrayList();

    String name;

    String description;

    public Menut(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent)iterator.next();
            component.print();
        }
    }
}
