package com.urvashigupta;

import java.util.Scanner;

public class Hamburger {
    private String bread;
    private String meat;
    private double price;

    public Hamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
        this.price = 5;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }

    public double basicBurger(){
        this.price = 5;
        System.out.println("Additional condiments cost price: ");
        System.out.println("Tomato ($0.25), Lettuce($0.35), Onion($0.25) and Pickels($0.30)");
        System.out.println("Press 1 to add condiments");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1){
            System.out.println("Press 1 if yes");
            System.out.println("Add Tomato? ");
            int yes = sc.nextInt();
            if(yes == 1){
                this.price+=0.25;
            }
            System.out.println("Add Lettuce? ");
            yes = sc.nextInt();
            if(yes ==1){
                this.price += 0.35;
            }
            System.out.println("Add Onion? ");
            yes = sc.nextInt();
            if(yes ==1){
                this.price += 0.25;
            }
            System.out.println("Add Pickels? ");
            yes = sc.nextInt();
            if(yes ==1){
                this.price += 0.30;
            }
            return this.price;
        }
        return this.price;

    }


}
