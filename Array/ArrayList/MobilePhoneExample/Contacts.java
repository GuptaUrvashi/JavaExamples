package com.urvashigupta;

public class Contacts {
    private String name;
    private String PhoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }
}
