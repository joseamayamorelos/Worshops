package Acceso;

public class Main {

    public static void main(String[] args) {
        
        
        Estudiante student1 = new Estudiante("Jose", 20, 4.3);

        
        Carro car = new Carro("Audi", "232nnmd", 250);

    
        System.out.println("Velocidad máxima inicial del carro: " + car.getMaxSpeed() + " km/h");

        
        car.accelerate(100);

        
        System.out.println("Velocidad máxima después de acelerar: " + car.getMaxSpeed() + " km/h");

        
        System.out.println("Nombre del estudiante: " + student1.getName());
        System.out.println(student1);
    }
}

