package me.eladiofeijoo.javadesingnpatterns.abstract_factory.factories;

import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Factory;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Phone;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Watch;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.products.AnalogPhone;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.products.SmartWatch;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.products.Smartphone;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.products.WindUpWatch;

public class SmartFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new Smartphone();
    }

    @Override
    public Watch createWatch() {
        return new SmartWatch();
    }
}
