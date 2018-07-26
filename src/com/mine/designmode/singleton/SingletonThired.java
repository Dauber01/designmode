package com.mine.designmode.singleton;

/**
 * @author Lucifer
 * @do 单例的抵挡额实现方法，应对延迟加载和多线程环境
 * @date 2018/07/25 14:13
 */
public class SingletonThired {

    private volatile static SingletonThired singletonThired;

    private SingletonThired() {
    }

    public static SingletonThired getInstance(){
        if (null == singletonThired){
            synchronized (SingletonThired.class){
                if (null == singletonThired){
                    singletonThired = new SingletonThired();
                }
            }
        }
        return singletonThired;
    }

}
