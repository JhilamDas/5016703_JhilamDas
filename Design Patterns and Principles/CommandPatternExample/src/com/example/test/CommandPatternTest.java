package com.example.test;

import com.example.command.*;
import com.example.receiver.Light;

public class CommandPatternTest {

    public static void main(String[] args) {
        // Create receiver
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        // Create command objects
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Turn on living room light
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();

        // Turn off living room light
        remote.setCommand(livingRoomLightOff);
        remote.pressButton();

        // Turn on kitchen light
        remote.setCommand(kitchenLightOn);
        remote.pressButton();

        // Turn off kitchen light
        remote.setCommand(kitchenLightOff);
        remote.pressButton();
    }
}