package com.company;

import java.util.logging.Logger;


public class Main {

    private static final Logger log = Logger.getLogger("Main");

    public static void main(String[] args) {
        Controller controller = new Controller();
        Power power = new Power();
        PowerOn powerOn = new PowerOn(power);
        controller.setCommand(powerOn);
        controller.pressButton();

        Sound sound = new Sound(14);
        SoundDown soundDown = new SoundDown(sound, 5);
        controller.setCommand(soundDown);
        controller.pressButton();
        System.out.println(sound.getLevel());

        SoundUp soundUp = new SoundUp(sound, 7);
        controller.setCommand(soundUp);
        controller.pressButton();
        System.out.println(sound.getLevel());

        Channel channel = new Channel(1);
        ChangeChannel changeChannel = new ChangeChannel(channel, 7);
        controller.setCommand(changeChannel);
        controller.pressButton();
        System.out.println(channel.getChannel());


        PowerOff powerOff = new PowerOff(power);
        controller.setCommand(powerOff);
        controller.pressButton();

    }
}
