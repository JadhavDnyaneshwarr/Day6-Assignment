package com.bridgelabz.logic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number => ");
        int num = scanner.nextInt();
        int j = 0;
        for (int i =2; i<num;i++){
            if (num%i==0){
                j++;
                break;
            }
        }
        if (j>0){
            System.out.println("the enter number is not Prime number");
        }else {
            System.out.println("the enter number is Prime number");
        }
    }
}
