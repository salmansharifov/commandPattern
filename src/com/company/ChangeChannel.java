package com.company;

public class ChangeChannel implements Command {
    private Channel channel;
    private int channelNumber;

    public ChangeChannel(Channel channel, int channelNumber) {
        this.channel = channel;
        this.channelNumber = channelNumber;
    }

    @Override
    public void execute() {
        channel.setChannel(channelNumber);
    }
}
