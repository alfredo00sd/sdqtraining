package reto1.clase03.models;

public class Note {

    private static int noteID;
    private  User user;
    private String note;

    public Note(User user, String note){
        this.user = user;
        this.note = note;
        noteID++;
    }

    @Override
    public String toString() {
        return "Note #"+Note.noteID+ " { \n" +
                "\t By.: " + user.getName() + " " + user.getLastName() +  ", Edad " +user.getAge() + "\n \t \"" + note +
                "\"." + "\n}";
    }
}
