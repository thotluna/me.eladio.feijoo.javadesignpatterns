package me.eladiofeijoo.javadesingnpatterns.structural.bridge;

public class TV  implements Device{

    private boolean enable;
    private int volume;
    private int channel;


    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enabled() {
        this.enable = true;
        System.out.println("Device is enable: " + isEnabled());
    }

    @Override
    public void disabled() {
        this.enable = false;
        System.out.println("Device is enable: " + isEnabled());
    }

    @Override
    public int getVolume(){
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume: " + volume);
    }

    @Override
    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Volume: " + channel);
    }

    @Override
    public int getChannel() {
        return channel;
    }
}
