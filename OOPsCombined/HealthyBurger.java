package com.urvashigupta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String bread, String meat) {
        super(bread, meat);
    }

    @Override
    public double basicBurger() {
        DecimalFormat df2 = new DecimalFormat("###.##");
        double price =  Double.valueOf(df2.format(super.basicBurger()));
        System.out.println("You get two more additional options: ");
        System.out.println("Black Bean ($0.50) and Tofu ($0.50)");
        System.out.println("Press 1 to add additionals:");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            System.out.println("Press 1 if yes");
            System.out.println("Add Black Bean ");
            int yes = sc.nextInt();
            if (yes == 1) {
                price += 0.50;
                System.out.println("Value of price:" +price);
            }
            System.out.println("Add Tofu ");
            yes = sc.nextInt();
            if (yes == 1) {
                price += 0.50;
                System.out.println("Value of price:" +price);
            }
        }
        return price;
    }
}
