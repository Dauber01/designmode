package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 没有被适配时候空按钮的bean
 * @date 2018/07/25 17:07
 */
public class NoComand implements Command {

    @Override
    public void execute() {
        System.out.println("do nothing, it's a null button");
    }

    @Override
    public void undo() {
        System.out.println("do nothing, it's a null button");
    }
}
