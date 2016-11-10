package com.urvashigupta;

/**
 * Created by Urvashi on 11/9/2016.
 */
public class BankAccount {
    private String accountNum;
    private double balance;
    private String name;
    private String email;
    private String phoneNum;

    public BankAccount(String accountNum, double balance, String name, String email, String phoneNum){
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getAccountNum(){
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of " +depositAmount+ " made. New balance is " +this.balance);
    }
    public void withdraw (double withdrawalAmount){
        if(this.balance-withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available, withdraw not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+ " processed, Remaining balance: " +this.balance );
        }
    }
}
