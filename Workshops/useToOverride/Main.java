package useToOverride;

public class Main {
    
    public static void main(String[] args) {
        
        var teacher = new Profesor();
        var student = new Student();
        var person = new Persona();

        
        teacher.presentation();  
        student.presentation();  
        person.presentation();   
    }
}
