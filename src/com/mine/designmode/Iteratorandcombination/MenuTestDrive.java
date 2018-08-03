package com.mine.designmode.Iteratorandcombination;

import java.util.Arrays;

/**
 * @author Lucifer
 * @do 餐厅的实现类进行测试
 * @date 2018/08/03 10:06
 */
public class MenuTestDrive {

    public static void main(String[] args){
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(Arrays.asList(cafeMenu));
        waitress.printMenu();
    }

}
