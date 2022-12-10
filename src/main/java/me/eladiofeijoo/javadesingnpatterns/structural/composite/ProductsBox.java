package me.eladiofeijoo.javadesingnpatterns.structural.composite;

import java.util.ArrayList;

public class ProductsBox implements Salable {
    ArrayList<Salable> box = new ArrayList<>();

    public void add(Salable element){
        box.add(element);
    }

    public void remove(Salable element){
        box.remove(element);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        for(Salable product : box){
            price += product.getPrice();
        }
        return price;
    }

    @Override
    public void print() {
        System.out.println("Box price: " + getPrice());
        for(Salable product : box){
            product.print();
        }
    }
}
