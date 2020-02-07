package reto1;

import reto1.utils.Console;

public class Year extends Console {

    public static void main(String[] args) {

        System.out.println("For daysInMonth press 1, leap year... other");
        byte daysInMonth = SCANNER.nextByte();

        if(daysInMonth == 1){

            System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
            int month = SCANNER.nextInt();
            daysInMonth(month);

        }else {
            System.out.println("Enter an Year :: ");

            int year = SCANNER.nextInt();
            leapYear(year);
        }
    }

    public static void daysInYear(){

    }

    public static void daysInMonth(int month){

//        month = SCANNER.nextInt();

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("\n 31 Days in this Month");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("\n 30 Days in this Month");
                break;

            case 2:
                System.out.println("\n Either 28 or 29 Days in this Month");
                break;

            default:
                System.out.println("\n Please enter Valid Number between 1 to 12");
        }
    }

    public static void leapYear(int year){

//        year = SCANNER.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");

    }
}
