package reto1;

import reto1.utils.Console;

public class IMC extends Console {

    /**
     * Formula
     * (English system) IMC = Peso (lb) / height (cm)2
     * (Metric system) IMC = Peso (kg) / height (m)2
     * */
    public static void main(String[] args) {

        double peso;
        double altura;
        double IMC;

        formattedMsg("Indique su peso(kg)",true);
        peso = SCANNER.nextDouble();

        formattedMsg("Indique su altura(m)",true);
        altura = SCANNER.nextDouble();

        IMC = peso/(altura*altura);

        System.out.println("Su IMC corresponde a: "+ DECIMAL.format(IMC));
        System.out.println("");

        if (IMC<18.5) {
            System.out.println("BAJO PESO");
        } else if (IMC>=18.5 && IMC<=24.9) {
            System.out.println("NORMAL");
        } else if (IMC>=25 && IMC<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
    }
}
