package com.urvashigupta;

public class Room {
    private String name;
    private Dimensions dimension;
    private Furniture furniture;

    public Room(String name, Dimensions dimension, Furniture furniture) {
        this.name = name;
        this.dimension = dimension;
        this.furniture = furniture;
    }

    public void stepin(){
        System.out.println("You may step in!");
        helloRoom();
    }

    private void helloRoom(){
        System.out.println("Welcome to my Room " + name);
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
