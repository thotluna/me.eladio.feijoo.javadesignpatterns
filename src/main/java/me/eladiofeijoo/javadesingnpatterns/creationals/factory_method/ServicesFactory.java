package me.eladiofeijoo.javadesingnpatterns.creationals.factory_method;

import me.eladiofeijoo.javadesingnpatterns.creationals.factory_method.services_concrete.InstallationService;
import me.eladiofeijoo.javadesingnpatterns.creationals.factory_method.services_concrete.MaintenanceService;
import me.eladiofeijoo.javadesingnpatterns.creationals.factory_method.services_concrete.DesignService;

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
