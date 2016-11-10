package com.urvashigupta;

public class Main {

    public static void main(String[] args) {
        Furniture furniture = new Furniture(1, 1, 2);
        Dimensions dimensions = new Dimensions(60,60,40);
        Room room  = new Room("Living Room", dimensions, furniture);

        House house = new House(room, dimensions, furniture);

        house.helloHouse();
        house.ring();
        house.getRoom().stepin();
        house.getRoom().getFurniture().light();
        house.getRoom().getDimension().info();
    }
}
