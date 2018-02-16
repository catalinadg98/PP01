public class Profesor extends Persona {
    private String nomina;

    public Profesor() {
        nomina = "";
    }

    public Profesor(String nomina, String nombre, char genero, String fechaNac) {
        this.nomina = nomina;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNac = fechaNac;
    }

    public void setHorario(void horario) {
        Horario = horario;
    }
}

