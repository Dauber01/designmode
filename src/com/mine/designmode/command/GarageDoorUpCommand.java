package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 车库门开启的命令bean
 * @date 2018/07/25 17:41
 */
public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }

}
