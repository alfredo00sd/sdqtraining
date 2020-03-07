package org.fastTask;

import java.io.*;
import java.util.logging.Logger;

public class FileManger {

    private File file = new File("fileMe.txt");
    private static final Logger LOGGER = Logger.getLogger(FileManger.class.getName());
    char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    int count = 0;

    public FileManger(){

    }

    public void amountOfLetters(){

    }

    public void amountOfNumbers(){

    }

    public void amountOfVowels(String text){

        for (int i = 0; i< text.length(); i++){

            char ch = text.charAt(i);

            for(int j = 0; j < text.length(); j++){

                if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                    count ++;
                }
            }

        }
        System.out.println("Number of vowels is "+count);
    }

    //\\//\\//\\/\//\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
    //::> Hacer un arreglo con cada amount
    //::> imprimir promedio de un arrego
    //::> Numero mayor y menor
    //::> Ordenar de menor a mayor y viceversa
    //::> suma(posciones pares) x suma(posciones impares)
    //::> Crear un subArreglo a partir de otro
    ////\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/

    public void writeFile(String content, boolean append) {

        PrintWriter printWriter = null;
        FileWriter writer;

        try {
            writer = new FileWriter(file, append);
            printWriter = new PrintWriter(writer);

            printWriter.println("Hello there! "+content);

            LOGGER.info("Logger Name: "+LOGGER.getName());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert printWriter != null;
            printWriter.close();
        }
    }

    public void writeFile(Person person, String content, boolean append) {

        PrintWriter printWriter = null;
        FileWriter writer;

        try {
            writer = new FileWriter(file, append);
            printWriter = new PrintWriter(writer);

            printWriter.println(person+" \n\t wrote: \n \t\t"+" \""+content+"\". \n");

            LOGGER.info("Logger Name: "+LOGGER.getName());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert printWriter != null;
            printWriter.close();
        }
    }

    public void readFile(){

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
