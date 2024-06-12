
/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reloj
{
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        normalizarTiempo();
    }

    // Método para avanzar los segundos
    public void avanzarSegundero(int segundos) {
        this.segundos += segundos;
        normalizarTiempo();
    }

    // Método para retroceder los segundos
    public void retrocederSegundero(int segundos) {
        this.segundos -= segundos;
        normalizarTiempo();
    }

    // Método para avanzar los minutos
    public void avanzarMinutero(int minutos) {
        this.minutos += minutos;
        normalizarTiempo();
    }

    // Método para retroceder los minutos
    public void retrocederMinutero(int minutos) {
        this.minutos -= minutos;
        normalizarTiempo();
    }

    // Método para avanzar las horas
    public void avanzarHorario(int horas) {
        this.horas += horas;
        normalizarTiempo();
    }

    // Método para retroceder las horas
    public void retrocederHorario(int horas) {
        this.horas -= horas;
        normalizarTiempo();
    }

    // Método para normalizar el tiempo y manejar desbordamientos
    private void normalizarTiempo() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos = segundos % 60;
        } else if (segundos < 0) {
            minutos -= (-segundos / 60) + 1;
            segundos = 60 - (-segundos % 60);
        }

        if (minutos >= 60) {
            horas += minutos / 60;
            minutos = minutos % 60;
        } else if (minutos < 0) {
            horas -= (-minutos / 60) + 1;
            minutos = 60 - (-minutos % 60);
        }

        if (horas >= 24) {
            horas = horas % 24;
        } else if (horas < 0) {
            horas = 24 - (-horas % 24);
        }
    }

    // Método para mostrar el tiempo actual
    public String mostrarTiempo() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    
}

