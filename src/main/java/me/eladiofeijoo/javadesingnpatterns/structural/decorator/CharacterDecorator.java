package me.eladiofeijoo.javadesingnpatterns.structural.decorator;

public abstract class CharacterDecorator implements Character{

    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public double calculateDamage(double attack) {
        return character.calculateDamage(attack);
    }

    @Override
    public double calculateAttack() {
        return character.calculateAttack();
    }

    @Override
    public double getScore() {
        return character.getScore();
    }

    @Override
    public void reset() {
        character.reset();
    }
}
