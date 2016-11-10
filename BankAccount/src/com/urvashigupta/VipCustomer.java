package com.urvashigupta;

public class VipCustomer {
    private String name;
    private double creditlimit;
    private String email;

    public VipCustomer(){
        this("Deafult name", 1200, "Default Email");
    }

    public VipCustomer(String name, double creditlimit){
        this(name, creditlimit, "unknown");
    }

    public VipCustomer(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
