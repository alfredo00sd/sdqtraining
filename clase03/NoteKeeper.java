package reto1.clase03;

import reto1.clase03.models.Note;
import reto1.clase03.models.User;
import reto1.clase03.utils.FileManager;

public class NoteKeeper {

    private FileManager fileManager = new FileManager();

    public static void main(String[] args) {

        //Create the user...
        User user = new User();
        user.setName("Alfredo");
        user.setLastName("Acosta Peña");
        user.setAge((byte) 21);

        //Create the note...
        Note note = new Note(user, "Hola!");

        //Escribe en el file.

//        fileManager.writeFile(note);
    }

    public void createUser(String name, String lastName, byte age){

        if(name.equals("") || lastName.equals("") || age < 0){

            System.out.println("Usuario invalido, favor proveer los datos correctos y completos.");

        }else {
            User user = new User();

            user.setName(name);
            user.setLastName(lastName);
            user.setAge(age);
        }
    }

    public void saveNote(User user, String myNote){

        if(user != null && !myNote.equals("")){

            Note note = new Note(user, myNote);
            fileManager.writeFile(note);

        }else {
            System.out.println("Usuario invalido o nota vacia...");
        }
    }
}
