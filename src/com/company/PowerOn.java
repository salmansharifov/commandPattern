package com.company;

public class PowerOn implements Command {
    Power power;

    public PowerOn(Power power) {
        this.power = power;
    }

    @Override
    public void execute() {
        power.on();
    }
}
