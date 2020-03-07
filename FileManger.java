package org.fastTask;

import java.io.*;
import java.util.logging.Logger;

public class FileManger {

    private File file = new File("fileMe.txt");
    private static final Logger LOGGER = Logger.getLogger(FileManger.class.getName());

    public FileManger(){

    }

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
