package reto1.clase2;

import reto1.utils.Console;

import java.util.InputMismatchException;

public class Calculator extends Console {

    public static void main(String[] args) {

        formattedMsg("Seleccione la operacion", true);
        System.out.println("1) Multiplicar \n2) Sumar \n3) Restar \n4) Dividir");

        try {
            int Option = SCANNER.nextInt();

            switch (Option) {
                case 1 : {

                    System.out.print("Digit number A : ");
                    int numberA = SCANNER.nextInt();

                    System.out.print("Digit number B : ");
                    int numberB = SCANNER.nextInt();

                    System.out.println(numberA + " * " + numberB + " = " + multiply(numberA, numberB));

                    break;
                }
                case 2 : {
                    System.out.print("Digit number A : ");
                    int numberA = SCANNER.nextInt();

                    System.out.print("Digit number B : ");
                    int numberB = SCANNER.nextInt();

                    System.out.println(numberA + " + " + numberB + " = " + sum(numberA, numberB));

                    break;
                }
                case 3 : {
                    System.out.print("Digit number A : ");
                    int numberA = SCANNER.nextInt();

                    System.out.print("Digit number B : ");
                    int numberB = SCANNER.nextInt();

                    System.out.println(numberA + " - " + numberB + " = " + rest(numberA, numberB));

                    break;
                }
                case 4 : {
                    System.out.print("Digit number A : ");
                    int numberA = SCANNER.nextInt();

                    System.out.print("Digit number B : ");
                    int numberB = SCANNER.nextInt();

                    System.out.println(numberA + " / " + numberB + " = " + divide(numberA, numberB));

                    break;
                }
                default:
                    System.out.println("Mori envenenado...");
                    break;
            }

        }catch (InputMismatchException ie){
            System.out.println("Favor ingrese un valor valido.");
        }
    }

    private static int multiply(int numberA, int numberB){
        return (numberA * numberB);
    }

    private static int divide(int numberA, int numberB){
        return (numberA / numberB);
    }

    private static int rest(int numberA, int numberB){
        return (numberA - numberB);
    }

    private static int sum(int numberA, int numberB){
        return (numberA + numberB);
    }
}
