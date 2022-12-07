package me.eladiofeijoo.javadesingnpatterns.abstract_factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Analog Factory ---");
        Factory factory = CreateFactories.getInstance().factoryAnalog();
        printProducts(factory);
        System.out.println("Analog Factory ---");
        factory = CreateFactories.getInstance().factorySmart();
        printProducts(factory);
    }

    public static void printProducts(Factory factory){
        Watch watch = factory.createWatch();
        Phone phone = factory.createPhone();

        System.out.println(watch.whatTimeIsIT());
        System.out.println(phone.call());
    }
}
