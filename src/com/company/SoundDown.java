package com.company;

public class SoundDown implements Command {
    private Sound sound;
    private int level;

    public SoundDown(Sound sound, int level) {
        this.sound = sound;
        this.level = level;
    }

    @Override
    public void execute() {
        sound.down(this.level);
    }
}
