package com.urvashigupta;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("999-999-9999");

    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;
        startPhone();
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    System.out.println("Shutting Down...");
                    quit = true;
                    break;
            }
        }
    }
    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice option. ");
        System.out.println("\t 1 - To print your contact list. ");
        System.out.println("\t 2 - To add a contact. ");
        System.out.println("\t 3 - To update your contact list. ");
        System.out.println("\t 4 - To delete a contact. ");
        System.out.println("\t 5 - To search name in your contact list. ");
        System.out.println("\t 6 - To quit. ");
    }

    private static void printContact(){
        mobilePhone.printContacts();
    }

    private static void addContact(){
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new contact phoneNumber: ");
        String phoneNo = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phoneNo);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " +name+ ", phone= " +phoneNo);
        }else{
            System.out.println("Cannot add, " +name+ " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name =scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: " );
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: " );
        String newNum = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNum);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }

    }
    private static void removeContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    private static void searchContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name is " +existingContact.getName() + " phone number is "
                            +existingContact.getPhoneNumber());

    }
}
