package com.mine.designmode.template;

import java.util.Arrays;

/**
 * @author Lucifer
 * @do 排序鸭子的测试类
 * @date 2018/07/31 15:37
 */
public class DuckSortTestDrive {

    public static void main(String[] args){
        Duck[] ducks = {new Duck("Daffy", 8), new Duck("Dewey", 2)
                                    , new Duck("Howard", 7), new Duck("Louie", 2)
                                    , new Duck("Donald", 10), new Duck("Huey", 2)};
        System.out.println("Before sorting :");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("\nAfter sorting :");
        display(ducks);
    }

    public static void display(Duck[] ducks){
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }

}
