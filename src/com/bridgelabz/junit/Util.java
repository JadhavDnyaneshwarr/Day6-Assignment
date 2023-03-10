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
//        LocalDate date = LocalDate.of(y,m,d);
//        DayOfWeek day = DayOfWeek.from(date);
        int y1 = (y - (14-m)) /12;
        int x = y1 + (y1 /4) - (y1 /100) + (y1 /400);
        int m0 = m + 12 * ((14- m) / 12) -2;
        int day  = (d + x + 31* m0 / 12) % 7 ;

        switch (day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("wrong");
                break;
        }

        System.out.println(day);
    }

    static void temperatureConversion(){
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
        double R = (double) r / 1200;
        double n = Math.pow((1+R),(-m));
        System.out.println(R);
        System.out.println(n);
        double payment =  (double) (p * R)/ 1-(n);
        System.out.println("You should have " + payment + " payment per month to pay the loan");
    }
    public static void main(String[] args) {
        y = Integer.parseInt(args[0]); // year for day of week
        m = Integer.parseInt(args[1]); // month for day of week
        d = Integer.parseInt(args[2]); // date for day of week

        yr = Integer.parseInt(args[3]); // year for monthly payment
        p = Integer.parseInt(args[4]); // loan for monthly payment
        r = Integer.parseInt(args[5]); // rate of loan for monthly payment

        dayOfWeek();
        temperatureConversion();
        monthlyPayment();
    }
}
