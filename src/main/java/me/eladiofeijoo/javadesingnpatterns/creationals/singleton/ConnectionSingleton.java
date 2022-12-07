package me.eladiofeijoo.javadesingnpatterns.creationals.singleton;

public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    private int counter = 0;
    private ConnectionSingleton(){

    }

    public static ConnectionSingleton getInstance(){
        if(instance == null){
            instance = new ConnectionSingleton();

        }
        return instance;
    }

    public void incrementCounter(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
