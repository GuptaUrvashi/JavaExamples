package com.urvashigupta;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        for(int i =1; i<= input; i++){
            System.out.println(i +" : " +FibReverse(i));
        }

    }
    public static int FibReverse(int input){
        if(input < 1){
            return input;
        }
        if(input ==1 || input ==2){
            return 1;
        }
        return FibReverse(input-1) + FibReverse(input-2);

    }
}

