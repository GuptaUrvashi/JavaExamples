package com.urvashigupta;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); //clear input buffer

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                /*case 6:
                    processArrayList();
                    break;*/
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice option. ");
        System.out.println("\t 1 - To print the list of grocery items. ");
        System.out.println("\t 2 - To add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove and item from the list. ");
        System.out.println("\t 5 - To search an item from the list. ");
       /* System.out.println("\t 6 - To process an array. ");*/
        System.out.println("\t 6 - To quit the application. ");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter current item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }
    public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }
    public static void searchItem(){
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " +searchItem+ " in the grocery List");
        }else{
            System.out.println(searchItem +" is not in the shopping list");
        }
    }

    /*public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        //adding entire contents to new array. Copying an array
        newArray.addAll(groceryList.getGroceryList());
        //same as above. alternate way of copying array.
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }*/
}
