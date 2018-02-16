import javax.swing.*;

public class Materia {
    private String Nombre;
    private String Clave;
    private Horario horario;
    private Profesor Maestro;

    public Materia() {
        this.Nombre = "";
        this.Clave = "";
        this.horario = new Horario();
        this.Maestro = new Profesor();
    }
    public Materia(String Nombre, String Clave){
        this.Nombre=Nombre;
        this.Clave=Clave;

    }
    public void setHorario(Horario horario){
        this.horario=horario;
    }
    public void setMaestro(Profesor profesor){
        this.Maestro=profesor;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getClave(){
        return this.Clave;
    }
    public Horario getHorario(){
        return this.horario;
    }
    public Profesor getMaestro(){
        return this.Maestro;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
