package com.company;

public class PowerOff implements Command {
    Power power;

    public PowerOff(Power power) {
        this.power = power;
    }

    @Override
    public void execute() {
        power.off();
    }
}
