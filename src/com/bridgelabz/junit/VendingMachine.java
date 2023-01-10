package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rupees =>");
        int rupees = scanner.nextInt();

        int one =0;
        int two =0;
        int five =0;
        int ten =0;
        int fifty =0;
        int hundred =0;
        int fiveHundred =0;
        int thousand =0;

        while(rupees!=0){
            if (rupees>=1000){
                rupees -= 1000;
                thousand++;
            } else if (rupees>=500) {
                rupees -= 500;
                fiveHundred++;
            } else if (rupees>=100) {
                rupees -= 100;
                hundred++;
            } else if (rupees>=50) {
                rupees -= 50;
                fifty++;
            } else if (rupees>=10) {
                rupees -= 10;
                ten++;
            } else if (rupees>=5) {
                rupees -= 5;
                five++;
            } else if (rupees>=2) {
                rupees -= 2;
                two++;
            } else if (rupees>=1) {
                rupees -= 1;
                one++;
            } else {
                System.out.println(rupees);
            }
        }
        System.out.println("Thousand- " + thousand + " times from enter rupee");
        System.out.println("Five hundred- " + fiveHundred + " times from enter rupee");
        System.out.println("Hundred- " + hundred + " times from enter rupee");
        System.out.println("Fifty- " + fifty + " times from enter rupee");
        System.out.println("Ten- " + ten + " times from enter rupee");
        System.out.println("Five- " + five + " times from enter rupee");
        System.out.println("Two- " + two + " times from enter rupee");
        System.out.println("One- " + one + " times from enter rupee");
    }
}
