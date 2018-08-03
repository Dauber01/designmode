package com.mine.designmode.Iteratorandcombination;

import java.util.Iterator;

/**
 * @author Lucifer
 * @do 侍者的bean
 * @date 2018/08/03 10:42
 */
public class Waitresst {

    MenuComponent allMenus;

    public Waitresst(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n-----");
        while (iterator.hasNext()){
            MenuComponent menuComponent =
                    (MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }

}
