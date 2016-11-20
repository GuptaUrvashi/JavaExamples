package com.urvashigupta;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsorted = {2, 44, 23, 5, 11, 23, 3, 42, 90, 1};
        bubble(unsorted);
    }

    public static void bubble(int[] unsorted){
        System.out.println("Before sorting: " +Arrays.toString(unsorted));
        for(int i=0; i< unsorted.length-1; i++){
            for(int j=1; j <unsorted.length-i; j++){
                if(unsorted[j-1] > unsorted[j]){
                    int temp = unsorted[j];
                    unsorted[j]= unsorted[j-1];
                    unsorted[j-1] = temp;
                }
            }
            System.out.println("Bubble Sorted after " +(i+1)+ " pass: " + Arrays.toString(unsorted));
        }

    }

}
