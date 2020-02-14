package reto1.clase2;

import reto1.utils.Console;

import java.util.InputMismatchException;

public class Calculadora extends Console {

    public static void main(String[] args) {

        String Operation;

        formattedMsg("Seleccione la operacion", true);
        System.out.println("1) Multiplicar \n2) Sumar \n3) Restar \n4) Dividir");

        try {
            int Option = SCANNER.nextInt();

            switch (Option){
                case 1 : Operation = "Multiplicar"; break;
                case 2 : Operation = "Sumar"; break;
                case 3 : Operation = "Restar"; break;
                case 4 : Operation = "Dividir"; break;
                default : Operation = "Opcion invalida!";
            }
            System.out.println(Operation);
        }catch (InputMismatchException ie){
            System.out.println("Favor ingrese un valor valido.");
        }
    }
}
