package Herencia;

public class Persona {
    protected String name;
    protected int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void showPerson() {
        System.out.println("Name: " + name + ", " + "age: " + age );
    }
}
