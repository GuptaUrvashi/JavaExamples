package com.urvashigupta;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");

        bank.addBranch("San Francisco");

        bank.addCustomer("San Francisco", "Tim", 30.23);
        bank.addCustomer("San Francisco", "Mike", 231.45);
        bank.addCustomer("San Francisco", "Percy", 145.65);

        bank.addBranch("San Mateo");
        bank.addCustomer("San Mateo", "Bob", 150.00);

        bank.addCustomerTransaction("San Francisco", "Tim", 50.00);
        bank.addCustomerTransaction("San Francisco", "Tim", 23.00);
        bank.addCustomerTransaction("San Francisco", "Mike", 32.00);

        bank.listCustomers("San Francisco", true);
        bank.listCustomers("San Mateo", true);

        bank.addBranch("Cupertino");
        if (!bank.addCustomer("Cupertino", "Brian", 23.43)) {
            System.out.println("Error Cupertino branch does not exist");
        }

        if (!bank.addBranch("San Mateo")) {
            System.out.println("San Mateo already exists");
        }

        if (!bank.addCustomerTransaction("San Mateo", "Fergus", 232.22)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("San Francisco", "Tim", 23.23)) {
            System.out.println("Customer Tim already exists");
        }

    }
}
