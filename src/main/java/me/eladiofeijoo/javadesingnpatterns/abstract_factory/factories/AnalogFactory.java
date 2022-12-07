package me.eladiofeijoo.javadesingnpatterns.abstract_factory.factories;

import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Factory;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Phone;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Watch;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.products.AnalogPhone;
import me.eladiofeijoo.javadesingnpatterns.abstract_factory.products.WindUpWatch;

public class AnalogFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new AnalogPhone();
    }

    @Override
    public Watch createWatch() {
        return new WindUpWatch();
    }
}
