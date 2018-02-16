

public abstract class Persona {
    protected String nombre;
    protected String fechaNac;
    protected char genero;
    protected float estatura;
    protected float peso;

    public Persona(){
        nombre="";
        fechaNac="";
        genero=0;
        estatura=0;
        peso=0;
    }

   public Persona(String nombre, String fechaNac, char genero){
       this.nombre=nombre;
       this.fechaNac=fechaNac;
       this.genero=genero;
   }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public void setPeso(float peso){
       this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public char getGenero() {
        return genero;
    }
    public float getEstatura(){
       return estatura;
    }
    public float getPeso(){
       return peso;
    }
    public abstract String toString();
}
