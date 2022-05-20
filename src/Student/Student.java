package Student;

import java.time.LocalDate;

public class Student {

    private Integer Id;
    private Integer Matricula;
    private String Password;

    private boolean Validacion;

    private LocalDate InicioDeSesion;

    public Student(Integer matricula, String password, LocalDate inicioDeSesion) {
        Matricula = matricula;
        Password = password;
        InicioDeSesion = inicioDeSesion;
        Id = (int) (Math.random() * 101);
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer matricula) {
        Matricula = matricula;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isValidacion() {
        return Validacion;
    }

    public void setValidacion(boolean validacion) {
        Validacion = validacion;
    }

    public LocalDate getInicioDeSesion() {
        return InicioDeSesion;
    }

    public void setInicioDeSesion(LocalDate inicioDeSesion) {
        InicioDeSesion = inicioDeSesion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Matricula=" + Matricula +
                ", Password='" + Password + '\'' +
                ", Validacion=" + Validacion +
                ", InicioDeSesion=" + InicioDeSesion +
                '}';
    }
}
