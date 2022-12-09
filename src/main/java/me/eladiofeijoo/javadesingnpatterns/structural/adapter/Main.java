package me.eladiofeijoo.javadesingnpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {

        RoundHold hold = new RoundHold(2.1);
        RoundPeg roundPeg = new RoundPeg(2.0);
        System.out.println("does the piece go into the hole? " + hold.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(2);
        RoundPeg adapter = new SquarePegAdapter(squarePeg);
        System.out.println("does the piece go into the hole? " + hold.fits(adapter));

        squarePeg = new SquarePeg(4);
        adapter = new SquarePegAdapter(squarePeg);
        System.out.println("does the piece go into the hole? " + hold.fits(adapter));

    }
}
