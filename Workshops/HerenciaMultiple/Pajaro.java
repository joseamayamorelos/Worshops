package HerenciaMultiple;

public class Pajaro implements Desarrollador, Cantante {

    @Override
    public void cantante() {
    System.out.println("cantando");
    }

    @Override
    public void volar() {
        System.out.println("volando");
    }
    
}
