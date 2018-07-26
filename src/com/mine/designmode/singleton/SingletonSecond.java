package com.mine.designmode.singleton;

/**
 * @author Lucifer
 * @do 单例的第二个实现方法，懒加载
 * @date 2018/07/25 14:11
 */
public class SingletonSecond {

    private static SingletonSecond singletonSecond = new SingletonSecond();

    private SingletonSecond() {
    }

    public static SingletonSecond getInstance(){
        return singletonSecond;
    }

}
