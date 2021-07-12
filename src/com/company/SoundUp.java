package com.company;

public class SoundUp implements Command {
    private Sound sound;
    private int level;

    public SoundUp(Sound sound, int level) {
        this.sound = sound;
        this.level = level;
    }

    @Override
    public void execute() {
        sound.up(this.level);
    }
}
