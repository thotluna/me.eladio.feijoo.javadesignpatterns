package me.eladiofeijoo.javadesingnpatterns.factory_method.services_concrete;

import me.eladiofeijoo.javadesingnpatterns.factory_method.Service;

public class InstallationService implements Service {
    @Override
    public String iAm() {
        return "I am Installations Service";
    }
}
