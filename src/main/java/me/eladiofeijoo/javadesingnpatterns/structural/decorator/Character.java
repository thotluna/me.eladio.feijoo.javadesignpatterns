package me.eladiofeijoo.javadesingnpatterns.structural.decorator;

public interface Character {
    double calculateDamage(double attack);
    double calculateAttack();
    double getScore();

    void reset();
}
