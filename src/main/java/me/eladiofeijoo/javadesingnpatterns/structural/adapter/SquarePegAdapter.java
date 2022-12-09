package me.eladiofeijoo.javadesingnpatterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0.0);
        this.peg = peg;

    }

    @Override
    public double getRadius() {
        return  peg.width() * Math.sqrt(2) / 2;
    }
}
