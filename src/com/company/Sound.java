package com.company;

public class Sound {
    private int level;

    public Sound(int level) {
        this.level = level;
    }

    public void up(int upLevel) {
        this.level += upLevel;
    }

    public void down(int downLevel) {
        this.level -= downLevel;
    }

    public int getLevel() {
        return this.level;
    }
}
