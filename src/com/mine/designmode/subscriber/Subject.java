package com.mine.designmode.subscriber;

/**
 * @author Lucifer
 * @do 被订阅者实现的接口
 * @date 2018/07/16 12:38
 */
public interface Subject {

    void registerObserver(Obserber o);

    void removeObserver(Obserber o);

    void notifyObserver();

}
