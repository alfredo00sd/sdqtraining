package org.fastTask;

public class Task {
    public static void main(String[] args) {

        FileManger manager = new FileManger();
        Person person = new Person("Alfredo",21);

        //manager.writeFile(person, "<?xml version=\"1.0\" encoding=\"windows-1252\" standalone=\"no\"?><!DOCTYPE log SYSTEM \"logger.dtd\">", true);
        manager.writeFile("TYummy", true);
        manager.readFile();
    }
}
