package com.urvashigupta;

import com.example.series.Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        Series series = new Series();

        System.out.println("Summation is: " +series.nSum(num));
        System.out.println("Factorial is: " +series.factorial(num));
        System.out.println("Fibonnaci is: " +series.fibonacci(num));

    }
}
