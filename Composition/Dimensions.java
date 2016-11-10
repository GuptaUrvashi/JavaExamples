package com.urvashigupta;

public class Dimensions {
    private int height;
    private int width;
    private int breadth;

    public Dimensions(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void info(){
        System.out.println("The dimensions are stored here");
    }
}
