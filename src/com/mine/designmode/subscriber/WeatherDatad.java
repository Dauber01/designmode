package com.mine.designmode.subscriber;

import java.util.Observable;

/**
 * @author Lucifer
 * @do 利用jdk默认类的被观察者
 * @date 2018/07/16 14:02
 */
public class WeatherDatad extends Observable{

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherDatad() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
