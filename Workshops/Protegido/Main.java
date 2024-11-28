package Protegido;

public class Main {
    
    public static void main(String[] args) {
        var jefe = new Gerente("José", 50000.0, "Recursos Humanos");
       // var moto = new Motocicleta("Yamaha", "De Pistón", 250);

        //moto.tipo;
        //moto.marca;
        //moto.obtenerCapacidadCilindrada();

        jefe.mostrarInformacion();
    }
}
