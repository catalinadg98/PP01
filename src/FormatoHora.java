public class FormatoHora {
    private int horas;
    private int minutos;
    private int segundos;

    public FormatoHora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public FormatoHora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
@Override
    public String toString() {
        return ("Horas: " + this.horas + " Minutos: " + this.minutos + " Segundos: " + segundos);
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    private boolean validaHrs(int horas) {
        if (horas <= 0 && horas < 23) {
            return true;
        }else{
            return false;
            }
        }
    private boolean validaMS(int minutos, int segundos){
        if((minutos<=0 && minutos<59) && (segundos <= 0 && segundos <59)) {
            return true;
        }else{
            return false;
        }
    }
}