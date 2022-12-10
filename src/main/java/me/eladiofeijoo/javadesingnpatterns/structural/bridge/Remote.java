package me.eladiofeijoo.javadesingnpatterns.structural.bridge;

public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isEnabled()) {
            device.disabled();
        } else {
            device.enabled();
        }
    }

    public void upVolume(){
        device.setVolume(device.getVolume() + 10);
    }

    public void downVolume(){
        device.setVolume(device.getVolume() - 10);
        System.out.println("Volume: " + device.getVolume());
    }

    public void upChannel(){
        device.changeChannel(device.getChannel() + 1);
    }

    public void downChannel(){
        device.changeChannel(device.getChannel() + 1);
    }

    public void changeChannel(int channel){
        device.changeChannel(channel);
    }


}
