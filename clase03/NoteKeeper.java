package reto1.clase03;

import reto1.clase03.models.Note;
import reto1.clase03.models.User;
import reto1.clase03.utils.FileManager;

public class NoteKeeper {

    private static FileManager fileManager = new FileManager();

    public static void main(String[] args) throws IOException {
 
    	Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String name = sc.next();
        
        System.out.print("Ingrese sus apellidos: ");
        String lastName = sc.next();
        
        System.out.print("Ingrese su edad: ");
        byte age = sc.nextByte();

       User userNote = createUser(name, lastName, age);
       
       if(userNote != null){
    
    	  System.out.println("Ok, "+userNote.getName()+" write your note.");
          String note = sc.next(); 
          
          //TimeUnit.MINUTES.sleep(1);
          
          System.in.read();
          
          saveNote(userNote, note);
        
       }else{
    	   System.out.println("Error en creacion de usuario");	   
       }      
    }

    public static User createUser(String name, String lastName, byte age){

        if(name.equals("") || lastName.equals("") || age < 0){

            System.out.println("Usuario invalido, favor proveer los datos correctos y completos.");

            return null; 
        }else {
            User user = new User();

            user.setName(name);
            user.setLastName(lastName);
            user.setAge(age);
             
            return user;
        }
    }

    public static void saveNote(User user, String myNote){

        if(user != null && !myNote.equals("")){

            Note note = new Note(user, myNote);
            fileManager.writeFile(note);
            
            System.out.println("Nota guardada!!");
            
        }else {
            System.out.println("Usuario invalido o nota vacia...");
        }
    }
}
