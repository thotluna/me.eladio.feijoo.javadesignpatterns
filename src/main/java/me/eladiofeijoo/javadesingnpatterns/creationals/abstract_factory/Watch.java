package me.eladiofeijoo.javadesingnpatterns.creationals.abstract_factory;

public abstract class Watch {
    protected String type;

    public Watch(String type) {
        this.type = type;
    }

    public abstract String whatTimeIsIT();
}
