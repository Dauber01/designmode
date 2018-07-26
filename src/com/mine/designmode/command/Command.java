package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 命令类对象的抽象接口
 * @date 2018/07/25 16:56
 */
public interface Command {

    public void execute();

    public void undo();

}
