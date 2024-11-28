package Acceso;

public class Estudiante {
    private String name;
    private int age;
    private double averageGrade;

    public Estudiante() {
        this.name = "Desconocido";
        this.age = 0;
        this.averageGrade = 0.0;
    }

    public Estudiante(String name, int age) {
        this.name = name;
        this.age = age > 0 ? age : 0; // Validación básica
    }

    public Estudiante(String name, int age, double averageGrade) {
        this(name, age);
        this.averageGrade = (averageGrade >= 0 && averageGrade <= 10) ? averageGrade : 0.0; // Validación básica
    }

    @Override
    public String toString() {
        return "Estudiante: Nombre = " + name + ", Edad = " + age + ", Promedio = " + averageGrade;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { if (age > 0) this.age = age; }

    public double getAverageGrade() { return averageGrade; }
    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0 && averageGrade <= 10) this.averageGrade = averageGrade;
    }
}
