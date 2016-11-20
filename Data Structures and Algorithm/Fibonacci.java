package com.urvashigupta;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner  = new Scanner(System.in);
        int input =  scanner.nextInt();
        scanner.nextLine();
        for(int i= 1; i <= input; i++){
            System.out.println(i + " : " +recursiveFib(i));

        }

    }
    public static int recursiveFib(int input){
        if(input < 1){
            return input;
        }
        if(input == 1 || input ==2){
            return 1;
        }
        return recursiveFib(input -1) + recursiveFib(input-2);
    }
}

