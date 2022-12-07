package me.eladiofeijoo.javadesingnpatterns.abstract_factory;

public abstract class Phone {

    private String technology;

    public Phone(String technology) {
        this.technology = technology;
    }

    public String call(){
        return "Hello, I call whit " + technology + " technology";
    }
}
