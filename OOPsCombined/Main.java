package com.urvashigupta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("###.##");
        double total;
        Scanner sc = new Scanner(System.in);
        int choice = menu();
        if (choice >0 && choice < 4){
            switch(choice){
                case 1:
                    System.out.println("Bread Type? ");
                    String bread = sc.nextLine();
                    System.out.println("Meat? ");
                    String meat = sc.nextLine();
                    Hamburger hamburger = new Hamburger(bread, meat);
                    System.out.println("The cost of basic burger is $5.00");
                    hamburger.basicBurger();
                    total = Double.valueOf(df2.format(hamburger.getPrice()));
                    System.out.println("Basic burger with " +hamburger.getBread()+ " and meat " +hamburger.getMeat()+
                                        " is $" + total);
                    break;
                case 2:
                    System.out.println("Bread: Brown Rye");
                    System.out.println("Meat: Chicken");
                    HealthyBurger healthyBurger = new HealthyBurger("Brown Rye", "Chicken");
                    total = Double.valueOf(df2.format(healthyBurger.basicBurger()));
                    System.out.println("Healthy burger with " +healthyBurger.getBread()+ " and meat " +healthyBurger.getMeat()+
                            " is $" + total);
                    break;
                case 3:
                    System.out.println("Bread Type? ");
                    bread = sc.nextLine();
                    System.out.println("Meat? ");
                    meat = sc.nextLine();
                    DeluxBurger deluxBurger= new DeluxBurger(bread, meat);
                    deluxBurger.deluxBurger();
                    System.out.println("Delux burger with " +deluxBurger.getBread()+ " and meat " +deluxBurger.getMeat()+
                            " is $10.85");
                    break;
                default:
                    System.out.println("Incorrect input!");

            }
        }else{
            System.out.println("Incorrect input!");
        }
    }

    public static int menu(){
        System.out.println("Welcome to Bills Burger");
        System.out.println("------------------------");

        System.out.println("MENU");
        System.out.println("Our basic burger comes with 4 additions (additional charges) ");
        System.out.println("Press 1 for Basic Burger");
        System.out.println("Press 2 for Healthy Burger");
        System.out.println("Press 3 for Delux Burger");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;

    }
}
