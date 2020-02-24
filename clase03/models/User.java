package reto1.clase03.models;

public class User {

    private static int userCounter;
    private String name;
    private String lastName;
    private byte age;

    public User(){
        userCounter++;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
