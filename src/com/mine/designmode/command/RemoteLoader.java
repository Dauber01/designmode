package com.mine.designmode.command;

/**
 * @author Lucifer
 * @do 测试结构化的遥控器的实现
 * @date 2018/07/25 17:31
 */
public class RemoteLoader {

    public static void main(String[] args){

        //集成命令模式的遥控器
        /*RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchLightOnCommand = new LightOnCommand(kitchLight);
        LightOffCommand kitchLightOffCommand = new LightOffCommand(kitchLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingLightOnCommand, livingLightOffCommand);
        remoteControl.setCommand(1, kitchLightOnCommand, kitchLightOffCommand);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffWithCDCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);*/

        //在之前的基础上,集成撤销上一次操作的功能
       /* RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLigth = new Light("living room light");
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLigth);
        LightOffCommand lightOffCommand =  new LightOffCommand(livingRoomLigth);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();*/

       //在之前的基础上加上会调风速的风扇和独立的撤销操作
        RemoteControl remoteControl = new RemoteControl();
        CeilingFant ceilingFant = new CeilingFant("lving room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFant);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFant);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(new CeilingFan("hah"));

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

}
