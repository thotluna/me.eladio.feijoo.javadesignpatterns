package me.eladiofeijoo.javadesingnpatterns.structural.decorator;

public class HammerDecorator extends CharacterDecorator {
    private final double hammer = 20;
    public HammerDecorator(Character character) {
        super(character);
    }

    @Override
    public double calculateAttack() {
        return (character.calculateAttack() + hammer) * Math.random();
    }
}
