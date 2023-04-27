package reto9b.process;
/**
 * La clase Proceso modela un proceso con un color, una rapidez y un poder.
 */
public class Pelota {

    private String color;
    private int rapidez;
    private int poder;

    /**
     * Crea un nuevo proceso con el color especificado, una rapidez de 10 y un poder de 5.
     *
     * @param color el color del proceso
     */
    public Pelota(String color) {
        this.color = color;
        this.rapidez = 10;
        this.poder = 5;
    }

    /**
     * Disminuye la rapidez del proceso en 1.
     */
    public void disminuirRapidez() {
        this.rapidez--;
    }

    /**
     * Aumenta el poder del proceso en 1.
     */
    public void aumentarPoder() {
        this.poder++;
    }

    /**
     * Devuelve el color del proceso.
     *
     * @return el color del proceso
     */
    public String getColor() {
        return color;
    }

    /**
     * Devuelve la rapidez del proceso.
     *
     * @return la rapidez del proceso
     */
    public int getRapidez() {
        return rapidez;
    }

    /**
     * Devuelve el poder del proceso.
     *
     * @return el poder del proceso
     */
    public int getPoder() {
        return poder;
    }
}