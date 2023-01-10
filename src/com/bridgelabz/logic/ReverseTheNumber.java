package com.bridgelabz.logic;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number => ");
        int num = scanner.nextInt();
        int reverse = 0;
        int j=num;
        while (j!=0){
            int k = j%10;
            j = j/10;
            reverse = reverse * 10 + k;
        }
        System.out.println(reverse);
    }
}
