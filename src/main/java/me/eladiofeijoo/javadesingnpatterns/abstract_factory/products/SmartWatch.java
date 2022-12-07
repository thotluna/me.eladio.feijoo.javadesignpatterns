package me.eladiofeijoo.javadesingnpatterns.abstract_factory.products;

import me.eladiofeijoo.javadesingnpatterns.abstract_factory.Watch;

public class SmartWatch extends Watch {
    public SmartWatch() {
        super("SmartWatch");
    }

    @Override
    public String whatTimeIsIT() {
        return "Is an hour the " + type;
    }
}

