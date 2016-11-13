package com.urvashigupta;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Determine the length of the array: ");
        int num = sc.nextInt();
        int[] myArray = getIntegers(num);
        printArray(myArray);
        int[] newSortArray = sortIntegers(myArray);
        System.out.println("After Sorting, in descending order");
        printArray(newSortArray);

    }
    public static int[] getIntegers(int num){
        System.out.println("Enter the numbers for array of length: " +num);
        int[] myArray = new int[num];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Element #" +i+ " ,Number: " +myArray[i]);
        }
    }
    public static int[] sortIntegers(int[] myArray){
        int[] sortArray = new int[myArray.length];
        for(int i = 0; i < myArray.length; i++){
            sortArray[i] = myArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i<sortArray.length -1; i++){
                if(sortArray[i] < sortArray[i+1]){
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortArray;
    }
}
