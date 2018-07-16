package com.mine.designmode.subscriber;

/**
 * @author Lucifer
 * @do 订阅者实现的接口, 包括更新抽象方法
 * @date 2018/07/16 12:40
 */
public interface Obserber {

    void update(float temp, float humidity, float pressure);

}
