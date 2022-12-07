package me.eladiofeijoo.javadesingnpatterns.abstract_factory.products;

import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Watch;

public class WindUpWatch extends Watch {
    public WindUpWatch() {
        super("Wind-up Watch");
    }

    @Override
    public String whatTimeIsIT() {
        return "Is an hour the " + type;
    }
}
