package me.eladiofeijoo.javadesingnpatterns.structural.facade;

import me.eladiofeijoo.javadesingnpatterns.creationals.singleton.ConnectionSingleton;

import java.util.Scanner;

public class InOutConsole {
    private static InOutConsole instance;

    private InOutConsole(){

    }

    public static InOutConsole getInstance(){
        if(instance == null){
            instance = new InOutConsole();
        }
        return instance;
    }

    Scanner in = new Scanner(System.in);

    public void print(String message){
        System.out.println(message);
    }

    public String ask(String message){
        print(message);
        return in.nextLine();
    }

    public int askInt(String message){
        print(message);
        return in.nextInt();
    }



}
