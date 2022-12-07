package me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.products;

import me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory.Watch;

public class WindUpWatch extends Watch {
    public WindUpWatch() {
        super("Wind-up Watch");
    }

    @Override
    public String whatTimeIsIT() {
        return "Is an hour the " + type;
    }
}
