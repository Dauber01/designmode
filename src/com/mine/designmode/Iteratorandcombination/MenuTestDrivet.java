package com.mine.designmode.Iteratorandcombination;

/**
 * @author Lucifer
 * @do 组合模式的测试类
 * @date 2018/08/03 10:44
 */
public class MenuTestDrivet {

    public static void main(String[] args){
        MenuComponent pancakeHouseMenu =
                new Menut("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menut("DINER MENU", "DINER");
        MenuComponent cafeMenu =
                new Menut("CAFE MENU", "DINER");
        MenuComponent allMenu =
                new Menut("All MENUS", "ALL menus combined");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItemt("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItemt("Apple Pie", "Apple Pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        Waitresst waitresst = new Waitresst(allMenu);
        waitresst.printMenu();
    }
}
