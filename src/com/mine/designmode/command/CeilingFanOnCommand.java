package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 吊扇开启的开关bean
 * @date 2018/07/25 17:37
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }

}
