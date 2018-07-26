package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 宏命令的集合
 * @date 2018/07/26 15:20
 */
public class MacroCommand implements Command {

    Command[] commands;

    /**
     * @do 构造出其中的指令集
     * @param commands
     */
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    /**
     * @do 将指令集中的所有指令进行便利执行
     */
    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    /**
     * @do 将指令集中的所有的指令进行便利,并进行撤销
     */
    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
