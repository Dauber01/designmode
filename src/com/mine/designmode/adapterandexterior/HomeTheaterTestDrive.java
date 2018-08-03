package com.mine.designmode.adapterandexterior;

/**
 * @author Lucifer
 * @do 介于外观模式的家庭影院的测试
 * @date 2018/07/30 15:33
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args){
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CDPlayer()
                            , new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }

}
