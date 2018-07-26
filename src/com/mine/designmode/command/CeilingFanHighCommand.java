package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 调整风扇风速的命令集合
 * @date 2018/07/26 14:59
 */
public class CeilingFanHighCommand implements Command {

    CeilingFant ceilingFant;

    int prevSpeed;

    public CeilingFanHighCommand(CeilingFant ceilingFant) {
        this.ceilingFant = ceilingFant;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFant.getSpeed();
        ceilingFant.hign();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFant.HIGH){
            ceilingFant.hign();
        }else if (prevSpeed == CeilingFant.MEDIUM){
            ceilingFant.medium();
        }else if (prevSpeed == CeilingFant.LOW){
            ceilingFant.low();
        }else if (prevSpeed == CeilingFant.OFF){
            ceilingFant.off();
        }
    }
}
