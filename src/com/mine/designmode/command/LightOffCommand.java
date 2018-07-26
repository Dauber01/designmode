package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 实现关灯功能的命令实现bean
 * @date 2018/07/25 17:18
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
