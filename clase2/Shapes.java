package reto1.clase2;

import java.util.Scanner;

public class Shapes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        Character c;
        System.out.println("Enter height of the triangle : ");
        size = sc.nextInt();

        if(size >= 1 && size <= 100){

            System.out.println("Which character you want to use : ");
            c = sc.next().charAt(0);
            int i, j, k;
            for (i = size; i > 0; i--) {
                for (j = size; j > i; j--) {
                    System.out.print(" ");
                }
                for (k = 0; k < (i * 2 - 1); k++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }else {
            System.out.println("Esta fuera del rango permitido (1-100)");
        }

    }
}
