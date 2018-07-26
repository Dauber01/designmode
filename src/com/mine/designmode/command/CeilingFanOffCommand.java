package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 吊扇关闭的开关bean
 * @date 2018/07/25 17:38
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }

}
