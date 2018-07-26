package com.mine.designmode.singleton;

/**
 * @author Lucifer
 * @do 单例模式的第一个简单的实现方法
 * @date 2018/07/25 14:06
 */
public class SingletonFirst {

    private static SingletonFirst singletonFirst;

    private SingletonFirst() {
    }

    public static SingletonFirst getInstance(){
        if (null == singletonFirst){
            singletonFirst = new SingletonFirst();
        }
        return singletonFirst;
    }

}
