package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 开启音响的命令bean
 * @date 2018/07/25 17:20
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        System.out.println("to turn down the button");
    }
}
