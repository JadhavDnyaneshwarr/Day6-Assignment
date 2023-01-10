package com.bridgelabz.logic;

public class FeboniccaiSeries {
    public static void main(String[] args) {
        int preValue=0;
        int addedValue=1;
        int i = 0;

        int j=0;
        while (i<=15){
            j = preValue + addedValue;
            preValue = addedValue;
            addedValue=j;
            System.out.println(addedValue);
            System.out.println(preValue);
            System.out.println("**");
            i++;
        }
    }
}
