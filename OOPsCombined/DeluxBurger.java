package com.urvashigupta;

public class DeluxBurger extends Hamburger{
    public DeluxBurger(String bread, String meat) {
        super(bread, meat);
    }
    public void deluxBurger(){
        System.out.println("Delux comes with two additions:");
        System.out.println("Chips: $1.35 and Drink(Lg): $2.50");
    }
}
