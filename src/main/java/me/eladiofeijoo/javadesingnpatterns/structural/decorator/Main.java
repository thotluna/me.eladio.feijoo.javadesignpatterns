package me.eladiofeijoo.javadesingnpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Character personaje = new Personaje();
        Character personaje2 = new Personaje();
        Character armorWhitCharacter = new ArmorCharacterDecorator(personaje2);



        do {
            armorWhitCharacter.calculateDamage(personaje.calculateAttack());
            personaje.calculateDamage(armorWhitCharacter.calculateAttack());
            System.out.println("Resultados");
            System.out.println("Personaje: " + personaje.getScore());
            System.out.println("Personaje with Armor: " + armorWhitCharacter.getScore());
        }while (personaje.getScore()> 0 && armorWhitCharacter.getScore() > 0);

        System.out.println("-----------------Nuevo");
        armorWhitCharacter.reset();
        Character personaje3 = new Personaje();
        Character withHammer = new HammerDecorator(personaje3);
        do {
            armorWhitCharacter.calculateDamage(withHammer.calculateAttack());
            withHammer.calculateDamage(armorWhitCharacter.calculateAttack());
            System.out.println("Resultados");
            System.out.println("Hammer: " + withHammer.getScore());
            System.out.println("Armor: " + armorWhitCharacter.getScore());
        }while (withHammer.getScore()> 0 && armorWhitCharacter.getScore() > 0);
    }
}
