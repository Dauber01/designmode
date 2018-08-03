package com.mine.designmode.adapterandexterior;

/**
 * @author Lucifer
 * @do 扩大器的bean
 * @date 2018/07/30 15:09
 */
public class Amplifier {

    DvdPlayer dvdPlayer;

    public void on(){
        System.out.println("Amplifier on");
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer){
        System.out.println("Amplifier setDvdPlayer");
    }

    public void setSurroundSound(){
        System.out.println("Amplifier setSurroundSound");
    }

    public void setVolume(int num){
        System.out.println("Amplifier setVolume" + num);
    }

    public void off(int num){
        System.out.println("Amplifier off");
    }

}
