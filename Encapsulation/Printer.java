package com.urvashigupta;

public class Printer {
    private int tonerLevel;
    private int numOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (this.tonerLevel >-1 && this.tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numOfPages = 0;
    }

    public int fillToner(int amount){
        if (amount >0 && amount <=100){
            if(this.tonerLevel + amount >100){
                return -1;
            }
            this.tonerLevel += amount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPaper(int pages){
        int pagestoPrint = pages;
        if(this.isDuplex){
            pagestoPrint/=2;
            System.out.println("Number of pages printed on Duplex printer: " +pagestoPrint);
        }else{
            System.out.println("Number of pages printed on a Non-Duplex printer: " +pagestoPrint);
        }
        this.numOfPages += pagestoPrint;
        return pagestoPrint;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
