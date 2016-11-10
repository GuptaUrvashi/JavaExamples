package com.urvashigupta;

public class Main {

    public static void main(String[] args) {
        BankAccount johnsAccount = new BankAccount("12345", 0.00, "John Doe", "johndoe@me.me", "999-999-9999");

        System.out.println("John's email: " + johnsAccount.getEmail());
        System.out.println("John's phone number: " +johnsAccount.getPhoneNum() );

        johnsAccount.withdraw(100.0);
        johnsAccount.deposit(50.0);

        johnsAccount.withdraw(100.0);
        johnsAccount.deposit(51.0);

        johnsAccount.withdraw(100.0);


        /* Example of running multiple constructor*/
        /*System.out.println("-------------");
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Gina", 3000.00, "gina@me.me");
        System.out.println(person3.getName());*/

    }
}
