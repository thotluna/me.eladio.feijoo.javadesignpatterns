package me.eladiofeijoo.javadesingnpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {

        InOutConsole myConsole = InOutConsole.getInstance();

        myConsole.print("Hello");
        String name = myConsole.ask("what your name?");
        int age = myConsole.askInt("how old you?");

        myConsole.print("You are " + name);
        myConsole.print("and you age is " +age);


    }
}
