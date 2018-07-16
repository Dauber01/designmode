package com.mine.designmode.subscriber;

/**
 * @author Lucifer
 * @do 当前天气模板的实现
 * @date 2018/07/16 13:39
 */
public class CurruntConditionDisplay implements Obserber, DisplayElement {

    private float temp;

    private float humidity;

    private float pressure;

    private Subject subject;

    public CurruntConditionDisplay(Subject weatherData){
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("今日天气: [temp:" + temp + ", humidity:" + humidity + ",pressure:" + pressure + "]");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

}
