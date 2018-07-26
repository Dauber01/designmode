package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 实现简单控制的遥控器bean
 * @date 2018/07/25 17:00
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
