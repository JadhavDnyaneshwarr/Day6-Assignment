package com.bridgelabz.logic;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number => ");
        int num = scanner.nextInt();
        int j=0;
        for (int i = 1; i<num; i++){
            if (num%i==0){
                j = i +j;
            }
        }
        System.out.println("The addition of divisor is " + j);
        if (num==j){
            System.out.println("the entered number is perfect number");
        }else {
            System.out.println("the entered number is not perfect number");
        }
    }
}
