import java.text.Format;
import java.text.Normalizer;

public class Horario {
    private FormatoHora inicio;
    private FormatoHora fin;
    private String aula;


    public Horario(){
        inicio = new FormatoHora(0,0,0);
        fin= new FormatoHora(0,0,0);
        aula="";
    }
    public Horario(FormatoHora inicio, FormatoHora fin, String aula){
        this.inicio=inicio;
        this.fin=fin;
        this.aula=aula;
    }
    public Horario(int hi, int mi, int si, int hf, int mf, int sf){
        inicio = new FormatoHora(hi, mi, si);
        fin= new FormatoHora(hf, mf, sf);

    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    public FormatoHora getInicio(){
        return inicio;
    }
    public FormatoHora getFin(){
        return fin;
    }
    public String getAula(){
        return aula;
    }
    public FormatoHora CalculaDuracion(){
        int h1 = inicio.getHoras();
        int m1 = inicio.getMinutos();
        int s1 = inicio.getSegundos();

        int h2 = fin.getHoras();
        int m2 = fin.getMinutos();
        int s2 = fin.getSegundos();

        if (m2 < m1) {
            h2 = h2-1;
            m2 = m2+60;
        }

        if (s2 < s1) {
            m2 = m2-1;
            s2 = s2+60;
        }

        return new FormatoHora(h2-h1, m2-m1, s2-s1);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}