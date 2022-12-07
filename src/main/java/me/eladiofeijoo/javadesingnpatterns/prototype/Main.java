package me.eladiofeijoo.javadesingnpatterns.prototype;

public class Main {

    public static void main(String[] args) {

        Card card = new Card("ford", "sedan",4, "4f", "automatic");
        Card card2 = (Card) card.clone();

        System.out.println("Card 1: " + card);
        System.out.println("Card 2: " + card2);


    }
}
