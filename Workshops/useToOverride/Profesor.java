package useToOverride;

public class Profesor extends Persona {
    
    @Override
    public void presentation() {
        System.out.println("Hello, I am a teacher.");
    }
}
