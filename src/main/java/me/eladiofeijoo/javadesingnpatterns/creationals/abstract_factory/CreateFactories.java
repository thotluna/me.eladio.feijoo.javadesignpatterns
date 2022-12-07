package me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory;

import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.factories.AnalogFactory;
import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.factories.SmartFactory;

public class CreateFactories {
    private static CreateFactories instance;

    private CreateFactories() {}

    public static CreateFactories getInstance(){
        if(instance == null){
            instance = new CreateFactories();
        }
        return instance;
    }

    public Factory factoryAnalog() {
        return new AnalogFactory();
    }

    public Factory factorySmart(){
        return  new SmartFactory();
    }
}
