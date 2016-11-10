package com.urvashigupta;

public class Furniture {
    private int couch;
    private int TV;
    private int lamps;

    public Furniture(int couch, int TV, int lamps) {
        this.couch = couch;
        this.TV = TV;
        this.lamps = lamps;
    }

    public void light(){
        System.out.println("Turning on the lamp");
    }
}
