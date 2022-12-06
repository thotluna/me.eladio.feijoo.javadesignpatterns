package me.eladiofeijoo.javadesingnpatterns.builder;

public class Main {
    public static void main(String[] args) {

        PersonalComputer computerFirst = new PersonalComputerBuilder().build();
        PersonalComputer computerSecond = new PersonalComputerBuilder().setHardDisk(500).setRam(8).build();

        System.out.println(computerFirst);
        System.out.println(computerSecond);


    }
}
