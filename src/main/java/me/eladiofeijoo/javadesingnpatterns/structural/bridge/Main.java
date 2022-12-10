package me.eladiofeijoo.javadesingnpatterns.structural.bridge;

public class Main {

    public static void main(String[] args) {

        Device tv = new TV();
        SmartRemote remote = new SmartRemote(tv);

        remote.togglePower();
        remote.upVolume();
        remote.upVolume();
        remote.upVolume();
        remote.upChannel();
        remote.upChannel();
        remote.upChannel();
        remote.mute();
        remote.togglePower();
    }
}
