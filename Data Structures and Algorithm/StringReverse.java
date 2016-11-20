package com.urvashigupta;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello from the other side";
        System.out.println(str);

        //recursion method
        System.out.println("Reverse String through recursion: " + reverseRecursively(str));
        //iteration method
        System.out.println("Reverse String through iteration: " +reverseIteration(str));
        //using StringBuffer
        String reversed = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String through StringBuffer: " +reversed);

    }

    public static String reverseRecursively(String input){
        if(input.length() < 2){
            return input;
        }
        return reverseRecursively(input.substring(1)) +input.charAt(0);
    }

    public static String reverseIteration(String input){
        StringBuilder stringBuilder = new StringBuilder();
        char[] reverse = input.toCharArray();
        for(int i = reverse.length-1; i>=0; i--){
            stringBuilder.append(reverse[i]);
        }

        return stringBuilder.toString();
    }
}
