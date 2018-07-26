package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 实现开灯功能的命令实现bean
 * @date 2018/07/25 16:57
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
