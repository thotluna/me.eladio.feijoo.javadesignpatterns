package me.eladiofeijoo.javadesingnpatterns.creationals.singleton;

public class Main {

    public static void main(String[] args) {

        ConnectionSingleton connection = ConnectionSingleton.getInstance();
        System.out.println("connection: " + connection + " connection counter: " + connection.getCounter());

        ConnectionSingleton connection2 = ConnectionSingleton.getInstance();
        System.out.println("connection2: " + connection2 + " connection2 counter: " + connection2.getCounter());

        connection.incrementCounter();
        System.out.println("connection: " + connection + " connection counter: " + connection.getCounter());
        System.out.println("connection2: " + connection2 + " connection2 counter: " + connection2.getCounter());

        connection2.incrementCounter();
        System.out.println("connection: " + connection + " connection counter: " + connection.getCounter());
        System.out.println("connection2: " + connection2 + " connection2 counter: " + connection2.getCounter());

    }
}
