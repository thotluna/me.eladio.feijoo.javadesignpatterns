package me.eladiofeijoo.javadesingnpatterns.creationals.factory_method.services_concrete;

import me.eladiofeijoo.javadesingnpatterns.creationals.factory_method.Service;

public class MaintenanceService implements Service {
    @Override
    public String iAm() {
        return "I am Maintenance Services";
    }
}
