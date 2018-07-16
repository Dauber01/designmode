package com.mine.designmode.subscriber;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Lucifer
 * @do 利用jdk默认的订阅者
 * @date 2018/07/16 15:05
 */
public class CurrentConditionsDisplayd implements Observer, DisplayElement{

    Observable observable;

    private float temp;

    private float humidity;

    private float pressure;

    public CurrentConditionsDisplayd(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("今日天气: [temp:" + temp + ", humidity:" + humidity + ",pressure:" + pressure + "]");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDatad){
            WeatherDatad weatherDatad = (WeatherDatad)o;
            this.temp = ((WeatherDatad) o).getTemp();
            this.humidity = ((WeatherDatad) o).getHumidity();
            this.pressure = ((WeatherDatad) o).getPressure();
            display();
        }
    }
}
