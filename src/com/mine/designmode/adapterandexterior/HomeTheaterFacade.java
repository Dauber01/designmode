package com.mine.designmode.adapterandexterior;

/**
 * @author Lucifer
 * @do 利用外观模式构造家庭影院的简化组合
 * @date 2018/07/30 15:08
 */
public class HomeTheaterFacade {

    Amplifier amplifier;

    Tuner tuner;

    DvdPlayer dvd;

    CDPlayer cdPlayer;

    Projector projector;

    TheaterLights theaterLights;

    Screen screen;

    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvd, CDPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie ...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvdPlayer(new DvdPlayer());
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvd.on();
        dvd.play();
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down ...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off(1);
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
