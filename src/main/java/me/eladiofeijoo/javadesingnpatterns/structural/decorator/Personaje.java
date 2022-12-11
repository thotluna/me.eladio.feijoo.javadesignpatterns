package me.eladiofeijoo.javadesingnpatterns.structural.decorator;

public class Personaje implements Character{
    private String name = "Hero";
    private int speed = 1;
    private int heart = 1000;
    private double shield = 100.0;
    private double attack = 10.0;

    @Override
    public double calculateDamage(double attack) {
        double newAttack = shield * (attack * Math.random())/100;
        heart -= newAttack;
        System.out.println("Oh! me han dado. peri " + newAttack + " puntos");
        return newAttack;
    }

    @Override
    public double calculateAttack() {
        return attack;
    }

    @Override
    public double getScore() {
        return heart;
    }

    @Override
    public void reset() {
        heart = 1000;
    }
}
