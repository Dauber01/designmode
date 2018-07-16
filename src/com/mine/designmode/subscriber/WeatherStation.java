package com.mine.designmode.subscriber;

/**
 * @author Lucifer
 * @do 天气预报站
 * @date 2018/07/16 13:46
 */
public class WeatherStation {

    public static void main(String[] args){
        /*WeatherData weatherData =  new WeatherData();
        CurruntConditionDisplay curruntConditionDisplay =  new CurruntConditionDisplay(weatherData);
        weatherData.setMeasurements(30, 20, 19);*/
        WeatherDatad weatherDatad = new WeatherDatad();
        CurrentConditionsDisplayd currentConditionsDisplayd = new CurrentConditionsDisplayd(weatherDatad);
        weatherDatad.setMeasurements(30, 20, 19);
    }

}
