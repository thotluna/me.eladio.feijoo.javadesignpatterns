package me.eladiofeijoo.javadesingnpatterns.creationals.prototype;

import java.util.UUID;

public class Card implements Clonable{
    private UUID id;
    private String brand;
    private String type;
    private int door;
    private String motor;
    private String transmission;

    private Card() {}

    public Card(String brand, String type, int door, String motor, String transmission) {
        id = UUID.randomUUID();
        this.brand = brand;
        this.type = type;
        this.door = door;
        this.motor = motor;
        this.transmission = transmission;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getDoor() {
        return door;
    }

    public String getMotor() {
        return motor;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public Clonable clone() {
        return new Card(brand, type, door, motor, transmission);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", door=" + door +
                ", motor='" + motor + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
