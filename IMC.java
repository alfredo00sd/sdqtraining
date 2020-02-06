package reto1;

import reto1.utils.Console;

public class IMC extends Console {

    /**
     * Formula
     * (English system) IMC = Peso (lb) / height (cm)2
     * (Metric system) IMC = Peso (kg) / height (m)2
     * */
    public static void main(String[] args) {

        formattedMsg("Indique su peso(kg)",true);
        double peso = SCANNER.nextDouble();

        formattedMsg("Indique su altura(m)",true);
        double altura = SCANNER.nextDouble();

        System.out.println(DECIMAL.format(peso/(altura*altura)) );
    }

}
