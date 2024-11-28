package Constructores;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Agregar número de cuenta: ");
            var accountNumber = sc.nextLine();
            System.out.println("Agregar saldo: ");
            var balance = sc.nextDouble();
            sc.nextLine();
            System.out.println("Agregar tipo de cuenta: ");
            var accountType = sc.nextLine();
            var bankAccount = new Cuenta(accountNumber, balance, accountType);

            System.out.println("Agregar título del libro: ");
            var title = sc.nextLine();
            System.out.println("Agregar autor: ");
            var author = sc.nextLine();
            System.out.println("Agregar número de páginas: ");
            var numberOfPage = sc.nextInt();
            sc.nextLine();
            var book = new Libro(title, author, numberOfPage);

            System.out.println("Agregar nombre del estudiante: ");
            var name = sc.nextLine();
            System.out.println("Agregar edad: ");
            var age = sc.nextInt();
            sc.nextLine();
            System.out.println("Agregar curso: ");
            var course = sc.nextLine();
            var student = new Alumno(name, age, course);

            System.out.println(bankAccount);
            System.out.println(book);
            System.out.println(student);
        }
    }
}
