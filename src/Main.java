public class Main {
    public static void main(String args[]){

        FormatoHora i =new FormatoHora(6,0,0);
        FormatoHora f= new FormatoHora(8,0,0);
       Horario h = new Horario(i,f, "304");
       FormatoHora d= h.CalculaDuracion();
       System.out.println(d.toString());

       
    }
}
