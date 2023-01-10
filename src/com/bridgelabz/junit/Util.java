package com.bridgelabz.junit;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class Util {


    static int d;
    static int m;
    static int y;
    static int yr;
    static int p;
    static int r;
    static void dayOfWeek(){
        LocalDate date = LocalDate.of(y,m,d);
        DayOfWeek day = DayOfWeek.from(date);


        System.out.println(day);
    }

    static void TemperatureConversion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature=>");
        int temp = scanner.nextInt();
        System.out.println("enter the parameter 1= celsius or 2= fahrenheit  =>");
        int parameter = scanner.nextInt();
        int temperature;
        switch (parameter){
            case 1:
                temperature = (temp-32) * 5/9;
                System.out.println("the "+ temp +" celsius temperature is "+ temperature +" fahrenheit temperature.");
                break;
            case 2:
                temperature = (temp* 9/5) + 32;
                System.out.println("the "+ temp +" fahrenheit temperature is "+ temperature +" celsius temperature.");
                break;
            default:
                System.out.println("reenter your temperature unit");
        }
    }

    static void monthlyPayment(){
        System.out.println("********************************");
        int m = yr * 12;
        double R = r / 12;
        double n = Math.pow((1+R)/100,(-m));
        System.out.println(R);
        System.out.println(n);
        double payment = (p * R)/ 1-(n);
        System.out.println("You should have " + payment + " payment per month to pay the loan");
    }
    public static void main(String[] args) {
        y = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        d = Integer.parseInt(args[2]);
        yr = Integer.parseInt(args[3]);
        p = Integer.parseInt(args[4]);
        r = Integer.parseInt(args[5]);
        dayOfWeek();
//        TemperatureConversion();
        monthlyPayment();
    }
}
