package reto1.clase03;

import reto1.clase03.models.Note;
import reto1.clase03.models.User;
import reto1.clase03.utils.FileManager;

public class NoteKeeper {

    public static void main(String[] args) {

        //Create the user...
        User user = new User();
        user.setName("Alfredo");
        user.setLastName("Acosta Peña");
        user.setAge((byte) 21);

        //Create the note...
        Note note = new Note(user, "Hola!");

        //Escribe en el file.
        FileManager fileManager = new FileManager();
        fileManager.writeFile(note);
    }
}
