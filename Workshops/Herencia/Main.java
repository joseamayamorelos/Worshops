package Herencia;

public class Main {
    
    public static void main(String[] args) {
        var car = new Carro("toyota", 500, 4);
        var student = new Estudiante("Jose", 18, "sdasde2");

        student.showPerson();
        car.showVehicle();
    }
}
