package com.urvashigupta;

public class House {
    private Room room;
    private Dimensions dimensions;
    private Furniture furniture;

    public House(Room room, Dimensions dimensions, Furniture furniture) {
        this.room = room;
        this.dimensions = dimensions;
        this.furniture = furniture;
    }
    public void helloHouse(){
        System.out.println("Welcome to my House");

    }
    public void ring(){
        System.out.println("Ringing door bell...");
    }

    public Room getRoom() {
        return room;
    }

}
