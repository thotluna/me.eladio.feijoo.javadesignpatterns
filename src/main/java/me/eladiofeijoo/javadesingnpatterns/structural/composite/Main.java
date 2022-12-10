package me.eladiofeijoo.javadesingnpatterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Product keyboard = new Product("Keyboard", 20.00);
        Product mouse = new Product("mouse", 35.00);
        Product monitor = new Product("monitor", 150.00);

        ProductsBox smallBox = new ProductsBox();
        smallBox.add(keyboard);
        smallBox.add(mouse);

        ProductsBox box = new ProductsBox();
        box.add(monitor);
        box.add(smallBox);

        box.print();


    }
}
