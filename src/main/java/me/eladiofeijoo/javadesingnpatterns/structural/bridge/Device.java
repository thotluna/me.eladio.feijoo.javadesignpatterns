package me.eladiofeijoo.javadesingnpatterns.structural.bridge;

public interface Device {

    boolean isEnabled();
    void enabled();
    void disabled();

    void setVolume(int volume);
    int getVolume();
    void changeChannel(int channel);
    int getChannel();
}
