package com.urvashigupta;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public void printContacts(){
        System.out.println("You have " +this.myContacts.size()+ " in your Contact list");
        for(int i =0 ; i< this.myContacts.size(); i++){
            System.out.println((i+1) + ": Name - " +this.myContacts.get(i).getName()+
                                ", Phone Number- " +this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName()) >=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println( oldContact.getName()+", was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " +newContact.getName());
        return true;
    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println( contact.getName()+", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() +", was deleted!");
        return true;
    }

    private int findContact (String contactName){
       for(int i = 0; i< this.myContacts.size(); i++){
           Contacts contact = this.myContacts.get(i);
           if(contact.getName().equals(contactName)){
               return i;
           }
       }
       return -1;
   }
    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
}

