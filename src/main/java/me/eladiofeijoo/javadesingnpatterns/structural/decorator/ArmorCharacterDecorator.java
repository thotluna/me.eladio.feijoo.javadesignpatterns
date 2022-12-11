package me.eladiofeijoo.javadesingnpatterns.structural.decorator;

public class ArmorCharacterDecorator extends CharacterDecorator {
    private final double factorShield = 2;
    public ArmorCharacterDecorator(Character character) {
        super(character);
    }

    @Override
    public double calculateDamage(double attack) {
        double damage = character.calculateDamage(attack / 2);
        System.out.println("My escudo me protege un poco");
        return damage;
    }

}
