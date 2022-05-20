import java.util.Arrays;

public class Materias {
    private String Descripcion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. ";
    private String[] Materias = {"Calculo", "Fisica", "Ingles", "POO"};
    private Integer IdRegistro;

    private String[] Horarios = {"13:40", "14:30", "15:20", "14:10"};

    private String[] Tareas = {"Tarea de Mate", "Estudiar para el examen", "Reunion por zoom"};
    public Materias(Integer idRegistro) {
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

    public String[] getHorarios() {
        return Horarios;
    }

    public void setHorarios(String[] horarios) {
        Horarios = horarios;
    }

    public String[] getTareas() {
        return Tareas;
    }

    public void setTareas(String[] tareas) {
        Tareas = tareas;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "Descripcion='" + Descripcion + '\'' +
                ", Materias=" + Arrays.toString(Materias) +
                ", IdRegistro=" + IdRegistro +
                ", Horarios=" + Arrays.toString(Horarios) +
                ", Tareas=" + Arrays.toString(Tareas) +
                '}';
    }
}
