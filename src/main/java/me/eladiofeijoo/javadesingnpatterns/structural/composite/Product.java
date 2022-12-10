package me.eladiofeijoo.javadesingnpatterns.structural.composite;

public class Product implements Salable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Producto: " + name + " price: " + price);
    }
}
