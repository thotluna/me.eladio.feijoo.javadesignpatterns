package me.eladiofeijoo.javadesingnpatterns.structural.adapter;

public class RoundHold {
    private final double radius;

    public RoundHold(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg){
        return radius > peg.getRadius();
    }
}
