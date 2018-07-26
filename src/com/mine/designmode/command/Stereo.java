package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 音响的对应命令实体bean
 * @date 2018/07/25 17:21
 */
public class Stereo {

    private String name;

    public Stereo() {
    }

    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("the stereo is on");
    }

    public void setCD(){
        System.out.println("the CD is ready");
    }

    public void setVolume(int volume){
        System.out.println("now the volume is " + volume);
    }

}
