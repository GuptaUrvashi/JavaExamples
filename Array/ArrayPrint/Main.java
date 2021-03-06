package com.urvashigupta;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i =0; i <myIntegers.length; i++){
            System.out.println("Element " +i+ ", typed value was " +myIntegers[i]);
        }
        System.out.println("Average is " +getAverage(myIntegers));
        }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number+ " integer values. \r");
        int[] myArray = new int[number];
        for(int i =0 ; i <myArray.length; i++){
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return (double)sum/ (double)array.length;
    }
}
