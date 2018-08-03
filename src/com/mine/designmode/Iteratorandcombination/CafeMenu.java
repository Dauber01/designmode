package com.mine.designmode.Iteratorandcombination;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author Lucifer
 * @do 咖啡的菜单
 * @date 2018/08/03 9:22
 */
public class CafeMenu implements Menu{

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger And Air Fries", "Veggie burger on a whole weat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pino beans, salasa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator(){
        return  menuItems.values().iterator();
    }

}
