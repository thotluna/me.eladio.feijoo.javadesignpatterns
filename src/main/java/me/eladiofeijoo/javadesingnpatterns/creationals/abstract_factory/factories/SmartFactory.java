package me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.factories;

import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.Factory;
import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.Phone;
import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.Watch;
import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.products.SmartWatch;
import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.products.Smartphone;

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
