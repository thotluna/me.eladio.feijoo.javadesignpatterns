package me.eladiofeijoo.javadesingnpatterns.structural.bridge;

public class SmartRemote extends Remote{
    public SmartRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
