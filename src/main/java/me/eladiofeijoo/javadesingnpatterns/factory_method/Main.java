package me.eladiofeijoo.javadesingnpatterns.factory_method;


public class Main {
    public static void main(String[] args) {

        ServicesFactory factory = new ServicesFactory();
        Service service = factory.getService(TypeServices.INSTALLATION);
        System.out.println(service.iAm());

        Service service2 = factory.getService(TypeServices.MAINTENANCE);
        System.out.println(service2.iAm());

        Service service3 = factory.getService(TypeServices.DESIGN);
        System.out.println(service3.iAm());

    }
}
