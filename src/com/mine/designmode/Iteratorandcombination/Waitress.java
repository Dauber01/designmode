package com.mine.designmode.Iteratorandcombination;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Lucifer
 * @do 侍者的bean
 * @date 2018/08/02 20:45
 */
public class Waitress {

    List menus;

    public Waitress(List menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }

}
