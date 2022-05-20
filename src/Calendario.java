import java.util.Arrays;

public class Calendario {
    private String Descripcion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. ";
    private String[] Materias = {"Calculo", "Fisica", "Ingles", "POO"};
    private Integer IdRegistro;

    private String[] Horarios = {"13:40", "14:30", "15:20", "14:10"};
    public Calendario(Integer idRegistro) {
        IdRegistro = idRegistro;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String[] getMaterias() {
        return Materias;
    }

    public void setMaterias(String[] materias) {
        Materias = materias;
    }

    public Integer getIdRegistro() {
        return IdRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        IdRegistro = idRegistro;
    }

    @Override
    public String toString() {
        return "Calendario{" +
                "Descripcion='" + Descripcion + '\'' +
                ", Materias=" + Arrays.toString(Materias) +
                ", IdRegistro=" + IdRegistro +
                ", Horarios=" + Arrays.toString(Horarios) +
                '}';
    }
}
