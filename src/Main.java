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

        Calendario calendario = new Calendario(estudiante.getId());
        System.out.println(calendario);
    }
}