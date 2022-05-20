import Student.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese la matricula ");
        Integer matricula = sc.nextInt();
        System.out.print("Ingrese su password ");
        String password= sc.next();

        Student estudiante = new Student(matricula, password, LocalDate.now());
        System.out.println(estudiante);

        System.out.println("Ingrese la opcion que quiera consultar");
        System.out.println("1. Organizador Academico ");
        System.out.println("2. Organizador personal ");
        System.out.println("3. Calendario ");
        String opcion= sc.next();

        Materias materias = new Materias(estudiante.getId());
        System.out.println(materias);
    }
}