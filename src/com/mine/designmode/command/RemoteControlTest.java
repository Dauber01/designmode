package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 简单版遥控器的测试
 * @date 2018/07/25 17:02
 */
public class RemoteControlTest {

    public static void main(String[] args){
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();
    }

}
