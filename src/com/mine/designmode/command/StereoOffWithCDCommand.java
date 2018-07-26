package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 音响关闭的开关bean
 * @date 2018/07/25 17:45
 */
public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        System.out.println("off");
    }

    @Override
    public void undo() {
        System.out.println("on");
    }
}
