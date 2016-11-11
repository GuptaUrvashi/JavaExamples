package com.urvashigupta;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " +printer.getNumOfPages());
        int pagesPrinted  = printer.printPaper(4);
        System.out.println("Pages printed was " +pagesPrinted+ " new total print count for printer = " +printer.getNumOfPages());
        pagesPrinted = printer.printPaper(2);
        System.out.println("Pages printed was " +pagesPrinted+ " new total print count for printer = " +printer.getNumOfPages());
        System.out.println("Toner filled :" +printer.fillToner(40)+ "%");
    }

}
