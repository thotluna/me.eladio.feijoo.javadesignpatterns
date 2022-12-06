package me.eladiofeijoo.javadesingnpatterns.factory_method;

import me.eladiofeijoo.javadesingnpatterns.factory_method.services_concrete.DesignService;
import me.eladiofeijoo.javadesingnpatterns.factory_method.services_concrete.InstallationService;
import me.eladiofeijoo.javadesingnpatterns.factory_method.services_concrete.MaintenanceService;

public class ServicesFactory {
    private Service create(TypeServices type){
        switch (type){
            case MAINTENANCE -> {
                return new MaintenanceService();
            }
            case INSTALLATION -> {
                return new InstallationService();
            }
            case DESIGN -> {
                return new DesignService();
            }
        }
        return null;
    }

    public Service getService(TypeServices type){
        return create(type);
    }
}
