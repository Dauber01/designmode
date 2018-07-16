package com.mine.designmode.subscriber;

import java.util.ArrayList;

/**
 * @author Lucifer
 * @do 天气预报中心的抽象类
 * @date 2018/07/16 12:43
 */
public class WeatherData implements Subject {

    private ArrayList<Obserber> obserbers;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData() {
        obserbers = new ArrayList<Obserber>();
    }

    @Override
    public void registerObserver(Obserber o) {
        this.obserbers.add(o);
    }

    @Override
    public void removeObserver(Obserber o) {
        int i = obserbers.indexOf(o);
        if (i > 0){
            this.obserbers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Obserber obserber : obserbers) {
            obserber.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
