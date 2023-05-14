package reto9.process;
/**
 * Clase que representa a un ayudante.
 */
public class Ayudante {
    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelCrear;
    private int nivelArreglar;
    private int nivelDestructivo;

    /**
     * Constructor de la clase Ayudante.
     * @param numOjos número de ojos del ayudante
     * @param colorPiel color de piel del ayudante
     * @param altura altura del ayudante
     * @param nivelCrear nivel de habilidad del ayudante para crear objetos
     * @param nivelArreglar nivel de habilidad del ayudante para arreglar cosas
     * @param nivelDestructivo nivel de habilidad destructiva del ayudante
     */
    public Ayudante(int numOjos, String colorPiel, String altura, int nivelCrear, int nivelArreglar, int nivelDestructivo) {
        this.numOjos = numOjos;
        this.colorPiel = colorPiel;
        this.altura = altura;
        this.nivelCrear = nivelCrear;
        this.nivelArreglar = nivelArreglar;
        this.nivelDestructivo = nivelDestructivo;
    }

    /**
     * Obtiene el número de ojos del ayudante.
     * @return el número de ojos del ayudante
     */
    public int getNumOjos() {
        return numOjos;
    }

    /**
     * Obtiene el color de piel del ayudante.
     * @return el color de piel del ayudante
     */
    public String getColorPiel() {
        return colorPiel;
    }

    /**
     * Obtiene la altura del ayudante.
     * @return la altura del ayudante
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Obtiene el nivel de habilidad del ayudante para crear objetos.
     * @return el nivel de habilidad del ayudante para crear objetos
     */
    public int getNivelCrear() {
        return nivelCrear;
    }

    /**
     * Obtiene el nivel de habilidad del ayudante para arreglar cosas.
     * @return el nivel de habilidad del ayudante para arreglar cosas
     */
    public int getNivelArreglar() {
        return nivelArreglar;
    }

    /**
     * Obtiene el nivel de habilidad destructiva del ayudante.
     * @return el nivel de habilidad destructiva del ayudante
     */
    public int getNivelDestructivo() {
        return nivelDestructivo;
    }

    @Override
    public String toString() {
        return "Ayudante{" +
                "numOjos=" + numOjos +
                ", colorPiel='" + colorPiel + '\'' +
                ", altura='" + altura + '\'' +
                ", nivelCrear=" + nivelCrear +
                ", nivelArreglar=" + nivelArreglar +
                ", nivelDestructivo=" + nivelDestructivo +
                '}';
    }
}

